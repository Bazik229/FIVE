package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldNextRadioStation() {
        radio.setNumRadioStation(5);
        radio.nextRadioStation();
        assertEquals(6, radio.getNumRadioStation());
    }

    @Test
    void shouldNextRadioStationIsFirst() {
        radio.setNumRadioStation(9);
        radio.nextRadioStation();
        assertEquals(0, radio.getNumRadioStation());
    }

    @Test
    void shouldPrevRadioStation() {
        radio.setNumRadioStation(5);
        radio.prevRadioStation();
        assertEquals(4, radio.getNumRadioStation());
    }

    @Test
    void shouldPrevRadioStationIsLast() {
        radio.setNumRadioStation(0);
        radio.prevRadioStation();
        assertEquals(9, radio.getNumRadioStation());
    }

    @Test
    void shouldIncreaseVolume() {
        radio.setValueVolume(12);
        radio.increaseVolume();
        assertEquals(6, radio.getValueVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radio.setValueVolume(-2);
        radio.decreaseVolume();
        assertEquals(1, radio.getValueVolume());
    }

    @Test
    void hello(){
//        int a ;
//        int num = 4;
//        a = ++num;
//        num++;
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


//        System.out.println(a);
    }
}