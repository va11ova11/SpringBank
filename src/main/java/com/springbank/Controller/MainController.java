package com.springbank.Controller;

import com.springbank.Service.BankService;
import com.springbank.Service.PortfolioService;
import com.springbank.model.Portfolio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import static java.util.Comparator.comparingLong;

import java.util.List;

@Controller
public class MainController {

    final BankService bankService;
    final PortfolioService portfolioService;

    @Autowired
    public MainController(BankService bankService, PortfolioService portfolioService) {
        this.bankService = bankService;
        this.portfolioService = portfolioService;
    }


    @GetMapping("/main")
    public String hiInt(Model model){
        float balance = bankService.getBalance();
        List<Portfolio> portfolioList = portfolioService.getPortfolio();
        portfolioList.sort(comparingLong(Portfolio::getId));
        float sumAllFond = portfolioService.getSumAllFond();
        model.addAttribute("balance", balance);
        model.addAttribute("portfolioList", portfolioList);
        model.addAttribute("sumAllFond", sumAllFond);
        return "index";
    }
}
