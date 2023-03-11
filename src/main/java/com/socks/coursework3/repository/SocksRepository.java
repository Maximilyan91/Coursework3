package com.socks.coursework3.repository;

import com.socks.coursework3.model.Socks;
import com.socks.coursework3.model.SocksBatch;

import java.util.Map;

public interface SocksRepository {
    void save(SocksBatch socksBatch);

    int remove(SocksBatch socksBatch);

    Map<Socks, Integer> getAll();
}
