package luca.microservice.brewMicroservices.controller;

import luca.microservice.brewMicroservices.Model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById (@PathVariable UUID beerId) {

        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public  ResponseEntity<BeerDto> saveBeer(@RequestBody BeerDto beerDto) {

        return new ResponseEntity<>((HttpStatus.CREATED));
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDto> updateBeer(@PathVariable UUID beerId, @RequestBody BeerDto beerDto) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
