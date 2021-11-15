package com.infinx.controller;

import com.infinx.entity.Bill;
import com.infinx.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class BillController {
    @Autowired
    private BillService billService;

    @GetMapping("/bills")
    public List<Bill> getAllBills(){
        return billService.getAllBills();
    }

    @GetMapping("/bills/{id}")
    public Bill getBillById(@PathVariable("id") int id){
        return billService.getBillById(id);
    }

    @GetMapping("/bills/due/{date}")
    public Bill getBillByDueDate(@PathVariable("date") String date){
        return billService.getBillByDueDate(date);
    }
}
