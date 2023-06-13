package com.example.spring_practice1.service;

import org.springframework.stereotype.Service;

@Service
public class LottoService {
    private int hits = 0;
    public int addHit() {
        hits++;
        return hits;
    }
}
