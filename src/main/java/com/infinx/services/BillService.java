package com.infinx.services;

import com.infinx.entity.Bill;
import com.infinx.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class BillService {
    @Autowired
    private BillRepository billRepository;

    public List<Bill> getAllBills(){
        List<Bill> bills=null;
       try {
           bills= billRepository.findAll();
       }
       catch (Exception e){
           e.printStackTrace();
       }
       return bills;
    }

    public Bill getBillById(int id){
        Bill bill=null;
        try {
            bill= billRepository.findById(id).get();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return bill;
    }

    public Bill getBillByDueDate(String date){
        Bill bill=null;
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(date, formatter);
            bill= billRepository.findByDueDate(localDate);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return bill;


    }
}
