package com.socks.coursework3.service;

import com.socks.coursework3.model.Color;
import com.socks.coursework3.model.Size;
import com.socks.coursework3.model.SocksBatch;

public interface ValidationService {
    boolean validate(SocksBatch socksBatch);
    boolean validate(Color color, Size size, int cottonMin, int cottonMax);
}
