package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
       UIControl[] controls = { new TextBox(), new CheckBox() };
       for (var control : controls)
           control.render();    // polymorphism: declare render() in parent class UIControl
                                // then override render() in child classes TextBox and CheckBox
                                // so that we can just call render() here for different child classes
    }
}
