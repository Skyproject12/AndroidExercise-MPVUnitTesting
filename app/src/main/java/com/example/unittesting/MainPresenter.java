package com.example.unittesting;

// make presenter to proses algortma
public class MainPresenter {
    private MainView view;

    MainPresenter(MainView view) {
        this.view = view;
    }
    // make opration to take volume use patern
    public double volume(double length, double width, double height){
        return length*width*height;
    }
    public void calculateVolume(double length, double width, double height){
        double volume= volume(length, width, height);
        // give value calculate into MainModel
        // menyimpan hasil dari volume
        MainModel model= new MainModel(volume);
        // take into interface
        // memasukkan hasil dari volume ke dalam interface
        view.showVolume(model);
    }
}
