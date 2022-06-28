package com.springbank.Service;
import com.springbank.model.Portfolio;
import com.springbank.repository.PortfolioRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public class PortfolioService {

    final PortfolioRepository portfolioRepository;

    public PortfolioService(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    public List<Portfolio> getPortfolio(){
        return portfolioRepository.findAll();
    }

    public float getSumAllFond(){
        float sumAllFond = 0;
        List<Portfolio> portfolioList = portfolioRepository.findAll();
        for(int i = 0; i<portfolioList.size(); i++){
            sumAllFond += portfolioList.get(i).getFondSum();
        }
        return sumAllFond;
    }
}
