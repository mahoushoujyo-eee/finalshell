package com.finalshell.core;

import com.finalshell.ui.model.CB3;
import java.util.List;

public class SA extends ST {
   public com.finalshell.ui.model.CY3 p;
   public final com.finalshell.ui.model.CY3 l;
   public final List M;
   public final boolean O;
   public final int T;
   public final boolean Q;
   public final Runnable b;
   public final com.finalshell.ui.panel.U22 w;

   public SA(com.finalshell.ui.panel.U22 var1, com.finalshell.ui.model.CY3 var2, List var3, boolean var4, int var5, boolean var6, Runnable var7) {
      this.w = var1;
      this.l = var2;
      this.M = var3;
      this.O = var4;
      this.T = var5;
      this.Q = var6;
      this.b = var7;
      this.p = this.l;
   }

   public void U(com.finalshell.ui.model.CY3 var1, List var2) {
      SA var10;
      SA var8;
      String[] var3 = CB3.C$arrString();
      if (var1 == this.p) {
         byte var4 = 0;

         int var10000;
         label115: {
            for (com.finalshell.ui.model.CY3 var6 : var2) {
               var10000 = (var6.D().equals(this.M.get(0))) ? 1 : 0;
               if (var3 == null) {
                  break label115;
               }

               label111: {
                  label130: {
                     if (var3 != null) {
                        if (var10000 == 0) {
                           break label111;
                        }

                        var4 = 1;
                        if (var3 == null) {
                           break label130;
                        }

                        var10000 = this.M.size();
                     }

                     if (var10000 == 1) {
                        label101: {
                           label125: {
                              this.w.C(this);
                              var10000 = (this.O) ? 1 : 0;
                              label99:
                              if (var3 != null) {
                                 if (this.O) {
                                    var10000 = this.T;
                                    if (var3 == null) {
                                       break label99;
                                    }

                                    if (this.T == this.w.l) {
                                       this.w.G(var6, this.Q);
                                       if (var3 != null) {
                                          break label101;
                                       }
                                    }
                                 }

                                 var8 = this;
                                 if (var3 == null) {
                                    break label125;
                                 }

                                 var10000 = (this.Q) ? 1 : 0;
                              }

                              if (var10000 != 0) {
                                 this.w.P(var6);
                              }

                              var8 = this;
                           }

                           var8.w.O(var6);
                        }

                        Runnable var9 = this.b;
                        if (var3 != null) {
                           if (this.b == null) {
                              break;
                           }

                           var9 = this.b;
                        }

                        var9.run();
                        if (var3 != null) {
                           break;
                        }
                     }

                     this.p = var6;
                     this.M.remove(0);
                  }

                  this.w.K(var6);
                  if (var3 != null) {
                     break;
                  }
               }

               if (var3 == null) {
                  break;
               }
            }

            var10000 = var4;
         }

         label70: {
            label127: {
               if (var3 != null) {
                  if (var10000 != 0) {
                     return;
                  }

                  this.w.C(this);
                  var10 = this;
                  if (var3 == null) {
                     break label127;
                  }

                  var10000 = (this.O) ? 1 : 0;
               }

               if (var10000 != 0) {
                  var10 = this;
                  if (var3 == null) {
                     break label127;
                  }

                  if (this.T == this.w.l) {
                     this.w.G(var1, false);
                     if (var3 != null) {
                        break label70;
                     }
                  }
               }

               var10 = this;
            }

            var10.w.O(var1);
         }

         Runnable var11 = this.b;
         if (var3 != null) {
            if (this.b == null) {
               return;
            }

            var11 = this.b;
         }

         var11.run();
      }
   }

   public void Z(com.finalshell.ui.model.CY3 var1, Throwable var2) {
      String[] var3 = CB3.C$arrString();
      if (var3 != null) {
         if (var1 != this.p) {
            return;
         }

         this.w.C(this);
      }

      label33: {
         SA var10000;
         var10000 = this;
         label32:
         if (var3 != null) {
            if (this.O) {
               var10000 = this;
               if (var3 == null) {
                  break label32;
               }

               if (this.T == this.w.l) {
                  this.w.G(var1, false);
                  if (var3 != null) {
                     break label33;
                  }
               }
            }

            var10000 = this;
         }

         var10000.w.O(var1);
      }

      Runnable var4 = this.b;
      if (var3 != null) {
         if (this.b == null) {
            return;
         }

         var4 = this.b;
      }

      var4.run();
   }

   @Override
   public void X(CB3 var1, Throwable var2) {
      this.Z((com.finalshell.ui.model.CY3)var1, var2);
   }

   @Override
   public void y(CB3 var1, List var2) {
      this.U((com.finalshell.ui.model.CY3)var1, var2);
   }
}





