package cl.bootcamp.modulo_70.controller;
import cl.bootcamp.modulo_70.service.*;
import cl.bootcamp.modulo_70.entity.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.servlet.ModelAndView;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/deposit")
    public ModelAndView showDepositForm() {
        ModelAndView mav = new ModelAndView("deposit.jsp");
        mav.addObject("transaction", new TransactionEntity());
        return mav;
    }

    @PostMapping("/deposit")
    public ModelAndView deposit(@RequestParam int userId, @RequestParam double amount) {
        ModelAndView mav = new ModelAndView("deposit.jsp");
        try {
            TransactionEntity transaction = transactionService.deposit(userId, amount);
            mav.addObject("success", "Deposit successful: " + transaction.getAmount());
        } catch (IllegalArgumentException e) {
            mav.addObject("error", e.getMessage());
        }
        return mav;
    }

    @GetMapping("/withdraw")
    public ModelAndView showWithdrawForm() {
        ModelAndView mav = new ModelAndView("withdraw.jsp");
        mav.addObject("transaction", new TransactionEntity());
        return mav;
    }

    @PostMapping("/withdraw")
    public ModelAndView withdraw(@RequestParam int userId, @RequestParam double amount) {
        ModelAndView mav = new ModelAndView("withdraw.jsp");
        try {
            TransactionEntity transaction = transactionService.withdraw(userId, amount);
            mav.addObject("success", "Withdrawal successful: " + transaction.getAmount());
        } catch (IllegalArgumentException e) {
            mav.addObject("error", e.getMessage());
        }
        return mav;
    }

    @GetMapping("/transfer")
    public ModelAndView showTransferForm() {
        ModelAndView mav = new ModelAndView("transfer.jsp");
        mav.addObject("transaction", new TransactionEntity());
        return mav;
    }

    @PostMapping("/transfer")
    public ModelAndView transfer(@RequestParam int fromUserId, @RequestParam int toUserId, @RequestParam double amount) {
        ModelAndView mav = new ModelAndView("transfer.jsp");
        try {
            TransactionEntity transaction = transactionService.transfer(fromUserId, toUserId, amount);
            mav.addObject("success", "Transfer successful: " + transaction.getAmount());
        } catch (IllegalArgumentException e) {
            mav.addObject("error", e.getMessage());
        }
        return mav;
    }
    @GetMapping("/list")
    public ModelAndView listTransactions(@RequestParam int userId) {
        ModelAndView mav = new ModelAndView("transactions.jsp");
        List<TransactionEntity> transactions = transactionService.findAllTransactionsByUserId(userId);
        mav.addObject("transactions", transactions);
        return mav;
    }
}