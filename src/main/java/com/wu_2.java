package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Wu_2 extends MouseAdapter {
   final pA_3 O;

   Wu_2(pA_3 var1) {
      this.O = var1;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      int var2 = _y_2.M();
      if (var2 != 0 && pA_3.c(this.O) != null) {
         pA_3.c(this.O).a();
         pA_3.M(this.O, null);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var2;
      int var20;
      label273: {
         label272: {
            label276: {
               var2 = _y_2.M();
               var20 = var1.getButton();
               byte var10001 = 1;
               if (var2 != 0) {
                  if (var20 == 1) {
                     this.O.x();
                  }

                  var19 = this.O;
                  if (var2 == 0) {
                     break label276;
                  }

                  this.O.M = System.currentTimeMillis();
                  var20 = var1.getButton();
                  var10001 = 1;
               }

               if (var20 == var10001) {
                  this.O.A = true;
                  var20 = var1.getClickCount();
                  if (var2 == 0) {
                     break label273;
                  }

                  if (var20 != 1) {
                     break label272;
                  }

                  pA_3.f(this.O, pA_3.x(this.O, var1.getPoint()));
                  this.O.V();
                  this.O.repaint();
                  if (var2 != 0) {
                     break label272;
                  }
               }

               var19 = this.O;
            }

            var19.A = false;
         }

         var20 = -1;
      }

      int var3;
      label255: {
         var3 = var20;
         this.O.requestFocusInWindow();
         pA_3 var21 = this.O;
         MouseEvent var44 = var1;
         if (var2 != 0) {
            if (!pA_3.D(this.O, var1)) {
               var22 = null;
               break label255;
            }

            var21 = this.O;
            var44 = var1;
         }

         var22 = pA_3.C(var21, var44.getPoint());
      }

      int var45;
      label249: {
         label279: {
            label247: {
               com.Yw_2 var4 = var22;
               com.Yw_2 var23 = var4;
               if (var2 != 0) {
                  if (var4 == null) {
                     break label247;
                  }

                  var23 = var4;
               }

               var23.g().v();
               if (var2 != 0) {
                  break label279;
               }
            }

            var20 = var1.getButton();
            var45 = 1;
            if (var2 != 0) {
               label237: {
                  if (var20 == 1) {
                     var20 = this.O.m(var1);
                     if (var2 == 0) {
                        break label237;
                     }

                     if (var20 != 0) {
                        label280: {
                           int var5 = var1.getClickCount();
                           var20 = var5;
                           byte var46 = 1;
                           if (var2 != 0) {
                              if (var5 == 1) {
                                 break label280;
                              }

                              var20 = var5;
                              var46 = 2;
                           }

                           if (var2 != 0) {
                              if (var20 == var46) {
                                 label226: {
                                    XE var6 = pA_3.x(this.O, var1.getPoint());
                                    XE var7 = com.a7.t(var6, pA_3.T(this.O));
                                    XE var8 = com.a7.l(var6, pA_3.T(this.O));
                                    pA_3.t(this.O, new rU_3(var7));
                                    pA_3.e(this.O).m(var8);
                                    pA_3 var26 = this.O;
                                    if (var2 != 0) {
                                       if (!pA_3.S(this.O).V()) {
                                          break label226;
                                       }

                                       var26 = this.O;
                                    }

                                    pA_3.O(var26);
                                 }

                                 if (var2 != 0) {
                                    break label280;
                                 }
                              }

                              var20 = var5;
                              var46 = 3;
                           }

                           label186:
                           if (var20 == var46) {
                              XE var16 = pA_3.x(this.O, var1.getPoint());
                              int var17 = var16.r;

                              while (true) {
                                 if (var17 > -this.O.k().b()) {
                                    var20 = pA_3.T(this.O).D(var17 - 1).G();
                                    if (var2 == 0 || var2 == 0) {
                                       break;
                                    }

                                    if (var20 != 0) {
                                       var17--;
                                       if (var2 != 0) {
                                          continue;
                                       }
                                    }
                                 }

                                 var20 = var16.r;
                                 break;
                              }

                              int var18 = var20;

                              label283: {
                                 while (true) {
                                    if (var18 < pA_3.T(this.O).O()) {
                                       var28 = pA_3.T(this.O).D(var18).G();
                                       if (var2 == 0 || var2 == 0) {
                                          break;
                                       }

                                       if (var28) {
                                          var18++;
                                          if (var2 != 0) {
                                             continue;
                                          }
                                       }
                                    }

                                    pA_3.t(this.O, new rU_3(new XE(0, var17)));
                                    pA_3.e(this.O).m(new XE(this.O.N.R(), var18));
                                    var29 = this.O;
                                    if (var2 == 0) {
                                       break label283;
                                    }

                                    var28 = pA_3.S(this.O).V();
                                    break;
                                 }

                                 if (!var28) {
                                    break label186;
                                 }

                                 var29 = this.O;
                              }

                              pA_3.O(var29);
                           }
                        }

                        if (var2 != 0) {
                           break label279;
                        }
                     }
                  }

                  var20 = var1.getButton();
               }

               var45 = 2;
            }

            if (var2 != 0) {
               label175: {
                  if (var20 == var45) {
                     var20 = pA_3.S(this.O).x();
                     if (var2 == 0) {
                        break label175;
                     }

                     if (var20 != 0) {
                        var20 = this.O.m(var1);
                        if (var2 == 0) {
                           break label175;
                        }

                        if (var20 != 0) {
                           Object[] var30 = com.c.f();
                           Method var31 = com.c.d(270389152141252877L);
                           Object[] var59 = var30;
                           Object var48 = null;

                           try {
                              var32 = var31.invoke(var48, var59);
                           } catch (InvocationTargetException var14) {
                              throw var14.getTargetException();
                           }

                           Object[] var49 = com.c.f();
                           Method var10003 = com.c.d(306266403902896148L);
                           var59 = var49;
                           Object var50 = var32;
                           Method var33 = var10003;

                           try {
                              var34 = var33.invoke(var50, var59);
                           } catch (InvocationTargetException var13) {
                              throw var13.getTargetException();
                           }

                           Object[] var51 = com.c.f();
                           var10003 = com.c.d(221275956571705390L);
                           var59 = var51;
                           Object var52 = var34;
                           Method var35 = var10003;

                           try {
                              var20 = (Integer)var35.invoke(var52, var59);
                           } catch (InvocationTargetException var12) {
                              throw var12.getTargetException();
                           }

                           var3 = var20;
                           if (var2 != 0) {
                              break label279;
                           }
                        }
                     }
                  }

                  var20 = var1.getButton();
               }

               var45 = 3;
            }

            if (var2 == 0) {
               break label249;
            }

            if (var20 == var45) {
               com.Yw_2 var15 = pA_3.C(this.O, var1.getPoint());
               Object[] var37 = com.c.f();
               Method var38 = com.c.d(270389152141252877L);
               Object[] var63 = var37;
               Object var54 = null;

               try {
                  var39 = var38.invoke(var54, var63);
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }

               Object[] var55 = com.c.f();
               Method var67 = com.c.d(306266403902896148L);
               var63 = var55;
               Object var56 = var39;
               Method var40 = var67;

               try {
                  var41 = var40.invoke(var56, var63);
               } catch (InvocationTargetException var10) {
                  throw var10.getTargetException();
               }

               Object[] var57 = com.c.f();
               var67 = com.c.d(617094797338525076L);
               var63 = var57;
               Object var58 = var41;
               Method var42 = var67;

               try {
                  var20 = (Integer)var42.invoke(var58, var63);
               } catch (InvocationTargetException var9) {
                  throw var9.getTargetException();
               }

               var3 = var20;
            }
         }

         var20 = var3;
         var45 = com.c.c(518223218338208363L).getInt(null);
      }

      label288: {
         if (var2 != 0) {
            if (var20 == var45) {
               this.O.A(false);
               if (var2 != 0) {
                  break label288;
               }
            }

            var20 = var3;
            var45 = com.c.c(263914437926532128L).getInt(null);
         }

         if (var2 != 0) {
            if (var20 == var45) {
               this.O.r();
               if (var2 != 0) {
                  break label288;
               }
            }

            var20 = var3;
            var45 = com.c.c(260545218128102666L).getInt(null);
         }

         if (var2 != 0) {
            if (var20 == var45) {
               this.O.y();
               if (var2 != 0) {
                  break label288;
               }
            }

            var20 = var3;
            var45 = com.c.c(529156970726312971L).getInt(null);
         }

         if (var20 == var45) {
            this.O.z(var1.getX(), var1.getY());
         }
      }

      this.O.repaint();
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      int var2 = _y_2.y();
      int var10000 = this.O.requestFocusInWindow();
      if (var2 == 0) {
         this.O.repaint();
         this.O.A = false;
         if (pA_3.e(this.O) == null) {
            return;
         }

         var10000 = var1.getButton();
      }

      if (var10000 == 1) {
         this.O.K = new XE(var1.getPoint().x, var1.getPoint().y);
         this.O.N();
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





