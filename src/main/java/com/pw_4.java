package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

class pw_4 extends KeyAdapter {
   final Ic_2 V;

   pw_4(Ic_2 var1) {
      this.V = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      String var2 = com.kz_4.M();
      int var10000 = this.V.L.d.isShowing();
      if (var2 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = Ic_2.g(this.V).getModel().getSize();
      }

      label118: {
         if (var2 != null) {
            if (var10000 <= 0) {
               return;
            }

            var3 = Ic_2.g(this.V);
            if (var2 == null) {
               break label118;
            }

            var10000 = var3.getSelectedIndex();
         }

         if (var10000 != -1) {
            label93: {
               label92: {
                  label114: {
                     var10000 = GR.lD.J(var1);
                     if (var2 != null) {
                        if (var10000 != 0) {
                           break label114;
                        }

                        var10000 = GR.lR.J(var1);
                     }

                     if (var2 != null) {
                        if (var10000 != 0) {
                           break label114;
                        }

                        var10000 = GR.ru.J(var1);
                     }

                     if (var2 == null) {
                        break label93;
                     }

                     if (var10000 == 0) {
                        break label92;
                     }
                  }

                  Ic_2.w(this.V);
                  if (var2 != null) {
                     return;
                  }
               }

               var10000 = GR.lZ.J(var1);
            }

            if (var2 != null) {
               if (var10000 != 0) {
                  Ic_2.i(this.V, (File)Ic_2.g(this.V).getSelectedValue());
                  if (var2 != null) {
                     return;
                  }
               }

               var10000 = GR.rp.J(var1);
            }

            if (var2 != null) {
               if (var10000 != 0) {
                  com.CI var5 = Ic_2.g(this.V);
                  if (var2 != null) {
                     if (var5.getSelectedIndex() == 0) {
                        Ic_2.g(this.V).setSelectedIndex(Ic_2.g(this.V).getModel().getSize() - 1);
                        this.r();
                        if (var2 != null) {
                           return;
                        }
                     }

                     var5 = Ic_2.g(this.V);
                  }

                  var5.setSelectedIndex(Ic_2.g(this.V).getSelectedIndex() - 1);
                  this.r();
                  if (var2 != null) {
                     return;
                  }
               }

               var10000 = GR.rI.J(var1);
            }

            label115: {
               if (var2 != null) {
                  if (var10000 == 0) {
                     return;
                  }

                  var6 = Ic_2.g(this.V);
                  if (var2 == null) {
                     break label115;
                  }

                  var10000 = var6.getSelectedIndex();
               }

               if (var10000 == Ic_2.g(this.V).getModel().getSize() - 1) {
                  Ic_2.g(this.V).setSelectedIndex(0);
                  this.r();
                  if (var2 != null) {
                     return;
                  }
               }

               var6 = Ic_2.g(this.V);
            }

            var6.setSelectedIndex(Ic_2.g(this.V).getSelectedIndex() + 1);
            this.r();
            if (var2 != null) {
               return;
            }
         }

         var3 = Ic_2.g(this.V);
      }

      var3.setSelectedIndex(0);
      this.r();
   }

   private void r() {
      Ic_2.g(this.V)
         .scrollRectToVisible(Ic_2.g(this.V).getUI().getCellBounds(Ic_2.g(this.V), Ic_2.g(this.V).getSelectedIndex(), Ic_2.g(this.V).getSelectedIndex()));
   }
}





