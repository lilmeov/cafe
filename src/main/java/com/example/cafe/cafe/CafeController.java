package com.example.cafe.cafe;

import com.example.cafe.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cafes")
@RequiredArgsConstructor
public class CafeController {
    private final CafeService cafeService;


    @GetMapping("/mainPage")
    public String giveCafeListPage(Model model){
        List<Cafe> cafes = cafeService.getAllCafes();
        model.addAttribute("cafes", cafes);
        return "list-cafe";
    }

    @GetMapping("/searchCafes")
    public String giveSearchedCafes(Model model, @RequestParam(value = "name") String name){
        List<Cafe> cafes =cafeService.getCafesByName(name);
        model.addAttribute("cafes", cafes);
        return "searched-cafes";
    }

    @GetMapping("/searchByDescriptionCafes")
    public String giveSearchedByDescriptionCafes(Model model, @RequestParam(value = "desc") String desc){
        List<Cafe> cafes = cafeService.getCafesByDescription (desc);
        model.addAttribute("cafes", cafes);
        return "searched-cafes";
    }

    @GetMapping("/addNewPlace")
    public String giveAddCafePage(Model model){
        return "add-cafe";
    }

    @GetMapping("/saveCafe")
    public String addNewCafe(@RequestParam(value = "name") String name,
                             @RequestParam(value = "description") String description){
        cafeService.saveNewCafe(name, description);
        return "redirect:/cafes/mainPage";
    }
}
