package com.fyber.backend.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MyServiceTest {

    @InjectMocks
    private MyService myService;


//    private MockedStatic<FileInputStream> mockedFileInputStream;
/*
    @BeforeEach
    void setUp() {
        mockedFileInputStream = mockStatic(FileInputStream.class);
    }*/

    @Test
    void invoke() throws FileNotFoundException {
        String filePath = "valid/path/to/file.txt";

        // Mock the FileInputStream constructor to return a mocked instance

        FileInputStream mockFileInputStream = mock(FileInputStream.class);
      /*  mockedFileInputStream.when(() -> new FileInputStream(filePath)).thenReturn(mockFileInputStream);

        // Act
        myService.invoke(filePath);

        // Assert
        mockedFileInputStream.verify(() -> new FileInputStream(filePath), times(1));

*/

        try (MockedStatic<FileInputStream> dummyStatic = Mockito.mockStatic(FileInputStream.class)) {
            dummyStatic.when(() -> new FileInputStream(filePath))
                    .thenReturn(mockFileInputStream);

            dummyStatic.verify(() -> new FileInputStream(filePath), times(1));
        }


    }

}