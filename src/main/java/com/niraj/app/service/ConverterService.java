package com.niraj.app.service;

import java.io.IOException;
import java.util.List;

public interface ConverterService {
    boolean convertFile(String files, String fromFormat, String toFormat);
    void removeBackgroundFromImage(String files) throws IOException;
}


