package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class yU_3 extends MouseAdapter {
   final pA_3 w;

   yU_3(pA_3 var1) {
      this.w = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var2;
      int var18;
      label239: {
         label238: {
            label242: {
               var2 = _y_2.y();
               var18 = var1.getButton();
               byte var10001 = 1;
               if (var2 == 0) {
                  if (var18 == 1) {
                     this.w.x();
                  }

                  var17 = this.w;
                  if (var2 != 0) {
                     break label242;
                  }

                  this.w.M = System.currentTimeMillis();
                  var18 = var1.getButton();
                  var10001 = 1;
               }

               if (var18 == var10001) {
                  this.w.A = true;
                  var18 = var1.getClickCount();
                  if (var2 != 0) {
                     break label239;
                  }

                  if (var18 != 1) {
                     break label238;
                  }

                  pA_3.f(this.w, pA_3.x(this.w, var1.getPoint()));
                  this.w.V();
                  this.w.repaint();
                  if (var2 == 0) {
                     break label238;
                  }
               }

               var17 = this.w;
            }

            var17.A = false;
         }

         var18 = -1;
      }

      int var3;
      int var37;
      label221: {
         label245: {
            var3 = var18;
            this.w.requestFocusInWindow();
            var18 = var1.getButton();
            var37 = 1;
            if (var2 == 0) {
               label217: {
                  if (var18 == 1) {
                     var18 = this.w.m(var1);
                     if (var2 != 0) {
                        break label217;
                     }

                     if (var18 != 0) {
                        label246: {
                           int var4 = var1.getClickCount();
                           var18 = var4;
                           byte var38 = 1;
                           if (var2 == 0) {
                              if (var4 == 1) {
                                 break label246;
                              }

                              var18 = var4;
                              var38 = 2;
                           }

                           if (var2 == 0) {
                              if (var18 == var38) {
                                 XE var5 = pA_3.x(this.w, var1.getPoint());
                                 XE var6 = com.a7.t(var5, pA_3.T(this.w));
                                 XE var7 = com.a7.l(var5, pA_3.T(this.w));
                                 pA_3.t(this.w, new rU_3(var6));
                                 pA_3.e(this.w).m(var7);
                                 if (pA_3.S(this.w).V()) {
                                 }

                                 if (var2 == 0) {
                                    break label246;
                                 }
                              }

                              var18 = var4;
                              var38 = 3;
                           }

                           if (var18 == var38) {
                              XE var14 = pA_3.x(this.w, var1.getPoint());
                              int var15 = var14.r;

                              while (true) {
                                 if (var15 > -this.w.k().b()) {
                                    var18 = pA_3.T(this.w).D(var15 - 1).G();
                                    if (var2 != 0 || var2 != 0) {
                                       break;
                                    }

                                    if (var18 != 0) {
                                       var15--;
                                       if (var2 == 0) {
                                          continue;
                                       }
                                    }
                                 }

                                 var18 = var14.r;
                                 break;
                              }

                              int var16 = var18;

                              while (true) {
                                 if (var16 < pA_3.T(this.w).O()) {
                                    var22 = pA_3.T(this.w).D(var16).G();
                                    if (var2 != 0 || var2 != 0) {
                                       break;
                                    }

                                    if (var22) {
                                       var16++;
                                       if (var2 == 0) {
                                          continue;
                                       }
                                    }
                                 }

                                 pA_3.t(this.w, new rU_3(new XE(0, var15)));
                                 pA_3.e(this.w).m(new XE(this.w.N.R(), var16));
                                 var22 = pA_3.S(this.w).V();
                                 break;
                              }

                              if (var2 == 0 && var22) {
                                 this.w.A(false);
                              }
                           }
                        }

                        if (var2 == 0) {
                           break label245;
                        }
                     }
                  }

                  var18 = var1.getButton();
               }

               var37 = 2;
            }

            if (var2 == 0) {
               label164: {
                  if (var18 == var37) {
                     var18 = pA_3.S(this.w).x();
                     if (var2 != 0) {
                        break label164;
                     }

                     if (var18 != 0) {
                        var18 = this.w.m(var1);
                        if (var2 != 0) {
                           break label164;
                        }

                        if (var18 != 0) {
                           Object[] var23 = com.c.f();
                           Method var24 = com.c.d(270389152141252877L);
                           Object[] var51 = var23;
                           Object var40 = null;

                           try {
                              var25 = var24.invoke(var40, var51);
                           } catch (InvocationTargetException var13) {
                              throw var13.getTargetException();
                           }

                           Object[] var41 = com.c.f();
                           Method var10003 = com.c.d(306266403902896148L);
                           var51 = var41;
                           Object var42 = var25;
                           Method var26 = var10003;

                           try {
                              var27 = var26.invoke(var42, var51);
                           } catch (InvocationTargetException var12) {
                              throw var12.getTargetException();
                           }

                           Object[] var43 = com.c.f();
                           var10003 = com.c.d(221275956571705390L);
                           var51 = var43;
                           Object var44 = var27;
                           Method var28 = var10003;

                           try {
                              var18 = (Integer)var28.invoke(var44, var51);
                           } catch (InvocationTargetException var11) {
                              throw var11.getTargetException();
                           }

                           var3 = var18;
                           if (var2 == 0) {
                              break label245;
                           }
                        }
                     }
                  }

                  var18 = var1.getButton();
               }

               var37 = 3;
            }

            if (var2 != 0) {
               break label221;
            }

            if (var18 == var37) {
               Object[] var30 = com.c.f();
               Method var31 = com.c.d(270389152141252877L);
               Object[] var55 = var30;
               Object var46 = null;

               try {
                  var32 = var31.invoke(var46, var55);
               } catch (InvocationTargetException var10) {
                  throw var10.getTargetException();
               }

               Object[] var47 = com.c.f();
               Method var59 = com.c.d(306266403902896148L);
               var55 = var47;
               Object var48 = var32;
               Method var33 = var59;

               try {
                  var34 = var33.invoke(var48, var55);
               } catch (InvocationTargetException var9) {
                  throw var9.getTargetException();
               }

               Object[] var49 = com.c.f();
               var59 = com.c.d(617094797338525076L);
               var55 = var49;
               Object var50 = var34;
               Method var35 = var59;

               try {
                  var18 = (Integer)var35.invoke(var50, var55);
               } catch (InvocationTargetException var8) {
                  throw var8.getTargetException();
               }

               var3 = var18;
            }
         }

         var18 = var3;
         var37 = com.c.c(518223218338208363L).getInt(null);
      }

      label251: {
         if (var2 == 0) {
            if (var18 == var37) {
               this.w.A(false);
               if (var2 == 0) {
                  break label251;
               }
            }

            var18 = var3;
            var37 = com.c.c(263914437926532128L).getInt(null);
         }

         if (var2 == 0) {
            if (var18 == var37) {
               this.w.r();
               if (var2 == 0) {
                  break label251;
               }
            }

            var18 = var3;
            var37 = com.c.c(260545218128102666L).getInt(null);
         }

         if (var2 == 0) {
            if (var18 == var37) {
               this.w.y();
               if (var2 == 0) {
                  break label251;
               }
            }

            var18 = var3;
            var37 = com.c.c(529156970726312971L).getInt(null);
         }

         if (var18 == var37) {
            this.w.z(var1.getX(), var1.getY());
         }
      }

      this.w.repaint();
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      int var10000 = _y_2.y();
      this.w.A = false;
      int var2 = var10000;
      var10000 = this.w.requestFocusInWindow();
      if (var2 == 0) {
         this.w.repaint();
         if (pA_3.e(this.w) == null) {
            return;
         }

         var10000 = var1.getButton();
      }

      if (var10000 == 1) {
         this.w.K = new XE(var1.getPoint().x, var1.getPoint().y);
         this.w.N();
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





