package com.codewithmosh;

public abstract class UIControl {   // abstract class: can't be instantiated, only its subclasses can be
  private boolean isEnabled = true;

//  public UIControl(boolean isEnabled) {
//    this.isEnabled = isEnabled;
//  }

  public abstract void render();  // polymorphism: override render() in TextBox and CheckBox classes
                                  // abstract method: subclasses must override (implement) render method

  public final void enable() { isEnabled = true; }  // final methods can't be overridden
                                                    // final classes can't be extended/inherited or used for polymorphism
                                                    // only use final when no longer need modification

  public void disable() {
    isEnabled = false;
  }

  public boolean isEnabled() {
    return isEnabled;
  }
}
