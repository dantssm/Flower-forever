package ua.edu.ucu.apps.lab8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab8.model.Flower;
import ua.edu.ucu.apps.lab8.service.FlowerService;

@RestController
@RequestMapping("/api/v1")
public class FlowerController {

    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/flower")
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }

    @PostMapping("/flower")
    public Flower createFlower(@RequestBody Flower flower) {
        return flowerService.createFlower(flower);
    }
}
