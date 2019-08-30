package com.example.unittesting;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {

    // membuat object yang akan menggantikan object asli
    @Mock
    private MainPresenter presenter;
    private MainView view;
    // inisilaisasi method sebelum melakukan test
    @Before
    public void setUp(){
        view= mock(MainView.class);
        presenter= new MainPresenter(view);
    }
    // test volume
//    @Test
//    public void testVolumeWithIntegerInput(){
//        double volume= presenter.volume(2,8,1);
//        assertEquals(16, volume,0.0001);
//    }
    // test hasil volume apakah benar atau tidak
    @Test
    public void testVolumeWithDoubleInput(){
        double volume= presenter.volume(2.3,8.1, 2.9);
        assertEquals(54.0269999999994, volume, 0.0001);
    }
    // digunakan untuk melakukan test fungsi
    @Test
    public void testVolumeWithZeroInput(){
        double volume= presenter.volume(0,0,0);
        // memverify output yang di harapkan dan output yang sebenarnya
        assertEquals(0.0,volume,0.0001);
    }
    @Test
    public void testCalculateVolume(){
        presenter.calculateVolume(11.1,2.2,1);

        verify(view).showVolume(any(MainModel.class));
    }
}