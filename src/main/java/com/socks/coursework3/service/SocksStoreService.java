package com.socks.coursework3.service;

import com.socks.coursework3.model.Color;
import com.socks.coursework3.model.Size;
import com.socks.coursework3.model.SocksBatch;

public interface SocksStoreService {
    void accept(SocksBatch socksBatch);

    int issuance(SocksBatch socksBatch);

    int reject(SocksBatch socksBatch);

    int getCount(Color color, Size size, int cottonMin, int cottonMax);
}
