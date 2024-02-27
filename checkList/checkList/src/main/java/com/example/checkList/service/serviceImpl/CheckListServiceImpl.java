package com.example.checkList.service.serviceImpl;

import com.example.checkList.dto.CheckListDto;
import com.example.checkList.entity.CheckList;
import com.example.checkList.mapper.CheckListMapper;
import com.example.checkList.repository.CheckListRepository;
import com.example.checkList.service.interfaces.CheckListService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CheckListServiceImpl implements CheckListService {
    private final CheckListRepository checkListRepository;

    public CheckListServiceImpl(CheckListRepository checkListRepository) {
        this.checkListRepository = checkListRepository;
    }

    @Override
    public List<CheckListDto> getAllCheckLists() {
        List<CheckList> checkLists=checkListRepository.findAll();
        return checkLists.stream().map((allCheckLists) -> CheckListMapper.mapToCheckListDto(allCheckLists)).collect(Collectors.toList());
    }

    @Override
    public CheckListDto getCheckListByDateOfEntry(LocalDateTime dateOfEntry) {
        return CheckListMapper.mapToCheckListDto(checkListRepository.findByDateOfEntry(dateOfEntry));
    }

    @Override
    public CheckListDto createCheckList(CheckListDto checkListDto) {
        CheckList checkList=CheckListMapper.mapToCheckList(checkListDto);
        CheckList savedCheckList=checkListRepository.save(checkList);
        return CheckListMapper.mapToCheckListDto(savedCheckList);
    }
}
