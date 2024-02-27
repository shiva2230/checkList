package com.example.checkList.controller;

import com.example.checkList.dto.CheckListDto;
import com.example.checkList.service.interfaces.CheckListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/checklists")
@CrossOrigin(origins = "*")
public class CheckListController {

    @Autowired
    private final CheckListService checkListService;

    public CheckListController(CheckListService checkListService) {
        this.checkListService = checkListService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<CheckListDto>> getAllCheckLists() {
        List<CheckListDto> checkLists = checkListService.getAllCheckLists();
        return ResponseEntity.ok(checkLists);
    }

    @GetMapping("/getByDate")
    public ResponseEntity<CheckListDto> getCheckListByDateOfEntry(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dateOfEntry) {
        CheckListDto checkList = checkListService.getCheckListByDateOfEntry(dateOfEntry);
        if (checkList != null) {
            return ResponseEntity.ok(checkList);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("create")
    public ResponseEntity<CheckListDto> createCheckList(@RequestBody CheckListDto checkListDto) {
        checkListDto.setDateOfEntry(LocalDateTime.now());
        checkListDto.setCheckListStatus(true);
        CheckListDto createdCheckList = checkListService.createCheckList(checkListDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCheckList);
    }
}
