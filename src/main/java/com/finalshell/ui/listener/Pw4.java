package com.finalshell.ui.listener;

import com.finalshell.core.GR;
import com.finalshell.ui.panel.CI;
import com.finalshell.ui.panel.Kz4;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

public class Pw4 extends KeyAdapter {
   final Ic2 V;

   Pw4(Ic2 var1) {
      this.V = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      String var2 = Kz4.M();
      int var10000 = (this.V.L.d.isShowing()) ? 1 : 0;
      if (var2 != null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = Ic2.g(this.V).getModel().getSize();
      }

      label118: {
         if (var2 != null) {
            if (var10000 <= 0) {
               return;
            }

            var3 = Ic2.g(this.V);
            if (var2 == null) {
               break label118;
            }

            var10000 = var3.getSelectedIndex();
         }

         if (var10000 != -1) {
            label93: {
               label92: {
                  label114: {
                     var10000 = (GR.lD.J(var1)) ? 1 : 0;
                     if (var2 != null) {
                        if (var10000 != 0) {
                           break label114;
                        }

                        var10000 = (GR.lR.J(var1)) ? 1 : 0;
                     }

                     if (var2 != null) {
                        if (var10000 != 0) {
                           break label114;
                        }

                        var10000 = (GR.ru.J(var1)) ? 1 : 0;
                     }

                     if (var2 == null) {
                        break label93;
                     }

                     if (var10000 == 0) {
                        break label92;
                     }
                  }

                  Ic2.w(this.V);
                  if (var2 != null) {
                     return;
                  }
               }

               var10000 = (GR.lZ.J(var1)) ? 1 : 0;
            }

            if (var2 != null) {
               if (var10000 != 0) {
                  Ic2.i(this.V, (File)Ic2.g(this.V).getSelectedValue());
                  if (var2 != null) {
                     return;
                  }
               }

               var10000 = (GR.rp.J(var1)) ? 1 : 0;
            }

            if (var2 != null) {
               if (var10000 != 0) {
                  CI var5 = Ic2.g(this.V);
                  if (var2 != null) {
                     if (var5.getSelectedIndex() == 0) {
                        Ic2.g(this.V).setSelectedIndex(Ic2.g(this.V).getModel().getSize() - 1);
                        this.r();
                        if (var2 != null) {
                           return;
                        }
                     }

                     var5 = Ic2.g(this.V);
                  }

                  var5.setSelectedIndex(Ic2.g(this.V).getSelectedIndex() - 1);
                  this.r();
                  if (var2 != null) {
                     return;
                  }
               }

               var10000 = (GR.rI.J(var1)) ? 1 : 0;
            }

            label115: {
               if (var2 != null) {
                  if (var10000 == 0) {
                     return;
                  }

                  var6 = Ic2.g(this.V);
                  if (var2 == null) {
                     break label115;
                  }

                  var10000 = var6.getSelectedIndex();
               }

               if (var10000 == Ic2.g(this.V).getModel().getSize() - 1) {
                  Ic2.g(this.V).setSelectedIndex(0);
                  this.r();
                  if (var2 != null) {
                     return;
                  }
               }

               var6 = Ic2.g(this.V);
            }

            var6.setSelectedIndex(Ic2.g(this.V).getSelectedIndex() + 1);
            this.r();
            if (var2 != null) {
               return;
            }
         }

         var3 = Ic2.g(this.V);
      }

      var3.setSelectedIndex(0);
      this.r();
   }

   public void r() {
      Ic2.g(this.V).scrollRectToVisible(Ic2.g(this.V).getUI().getCellBounds(Ic2.g(this.V), Ic2.g(this.V).getSelectedIndex(), Ic2.g(this.V).getSelectedIndex()));
   }
}





