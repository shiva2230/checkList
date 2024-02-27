package com.example.checkList.service.interfaces;

import com.example.checkList.dto.CheckListDto;
import com.example.checkList.entity.CheckList;

import java.time.LocalDateTime;
import java.util.List;

public interface CheckListService {
    List<CheckListDto> getAllCheckLists();
    CheckListDto getCheckListByDateOfEntry(LocalDateTime dateOfEntry);
    CheckListDto createCheckList(CheckListDto checkListDto);


}
