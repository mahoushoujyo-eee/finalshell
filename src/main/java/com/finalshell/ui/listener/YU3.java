package com.finalshell.ui.listener;

import com.finalshell.core.RU3;
import com.finalshell.core.XE;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

public class YU3 extends MouseAdapter {
   final SetBackgroundImagePanel w;

   YU3(SetBackgroundImagePanel var1) {
      this.w = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var2;
      int var26;
      label219: {
         label218: {
            label222: {
               var2 = ConnectionProperty.y();
               var26 = var1.getButton();
               byte var10001 = 1;
               if (var2 == 0) {
                  if (var26 == 1) {
                     this.w.x();
                  }

                  var25 = this.w;
                  if (var2 != 0) {
                     break label222;
                  }

                  this.w.M = System.currentTimeMillis();
                  var26 = var1.getButton();
                  var10001 = 1;
               }

               if (var26 == var10001) {
                  this.w.A = true;
                  var26 = var1.getClickCount();
                  if (var2 != 0) {
                     break label219;
                  }

                  if (var26 != 1) {
                     break label218;
                  }

                  SetBackgroundImagePanel.f(this.w, SetBackgroundImagePanel.x(this.w, var1.getPoint()));
                  this.w.V$void();
                  this.w.repaint();
                  if (var2 == 0) {
                     break label218;
                  }
               }

               var25 = this.w;
            }

            var25.A = false;
         }

         var26 = -1;
      }

      int var3;
      int var31;
      label201: {
         label225: {
            var3 = var26;
            this.w.requestFocusInWindow();
            var26 = var1.getButton();
            var31 = 1;
            if (var2 == 0) {
               label197: {
                  if (var26 == 1) {
                     var26 = (this.w.m(var1)) ? 1 : 0;
                     if (var2 != 0) {
                        break label197;
                     }

                     if (var26 != 0) {
                        label226: {
                           int var4 = var1.getClickCount();
                           var26 = var4;
                           byte var32 = 1;
                           if (var2 == 0) {
                              if (var4 == 1) {
                                 break label226;
                              }

                              var26 = var4;
                              var32 = 2;
                           }

                           if (var2 == 0) {
                              if (var26 == var32) {
                                 XE var5 = SetBackgroundImagePanel.x(this.w, var1.getPoint());
                                 XE var6 = com.finalshell.core.A7.t(var5, SetBackgroundImagePanel.T(this.w));
                                 XE var7 = com.finalshell.core.A7.l(var5, SetBackgroundImagePanel.T(this.w));
                                 SetBackgroundImagePanel.t(this.w, new RU3(var6));
                                 SetBackgroundImagePanel.e(this.w).m(var7);
                                 if (SetBackgroundImagePanel.S(this.w).V()) {
                                 }

                                 if (var2 == 0) {
                                    break label226;
                                 }
                              }

                              var26 = var4;
                              var32 = 3;
                           }

                           if (var26 == var32) {
                              XE var22 = SetBackgroundImagePanel.x(this.w, var1.getPoint());
                              int var23 = var22.r;

                              while (true) {
                                 if (var23 > -this.w.k$ua_2().b()) {
                                    var26 = SetBackgroundImagePanel.T(this.w).D(var23 - 1).G();
                                    if (var2 != 0 || var2 != 0) {
                                       break;
                                    }

                                    if (var26 != 0) {
                                       var23--;
                                       if (var2 == 0) {
                                          continue;
                                       }
                                    }
                                 }

                                 var26 = var22.r;
                                 break;
                              }

                              int var24 = var26;

                              while (true) {
                                 if (var24 < SetBackgroundImagePanel.T(this.w).O()) {
                                    var30 = SetBackgroundImagePanel.T(this.w).D(var24).G();
                                    if (var2 != 0 || var2 != 0) {
                                       break;
                                    }

                                    if (var30) {
                                       var24++;
                                       if (var2 == 0) {
                                          continue;
                                       }
                                    }
                                 }

                                 SetBackgroundImagePanel.t(this.w, new RU3(new XE(0, var23)));
                                 SetBackgroundImagePanel.e(this.w).m(new XE(this.w.N.R(), var24));
                                 var30 = SetBackgroundImagePanel.S(this.w).V();
                                 break;
                              }

                              if (var2 == 0 && var30) {
                                 this.w.A(false);
                              }
                           }
                        }

                        if (var2 == 0) {
                           break label225;
                        }
                     }
                  }

                  var26 = var1.getButton();
               }

               var31 = 2;
            }

            if (var2 == 0) {
               label144: {
                  if (var26 == var31) {
                     var26 = SetBackgroundImagePanel.S(this.w).x();
                     if (var2 != 0) {
                        break label144;
                     }

                     if (var26 != 0) {
                        var26 = (this.w.m(var1)) ? 1 : 0;
                        if (var2 != 0) {
                           break label144;
                        }

                        if (var26 != 0) {
                           Registry.emptyArgs();
                           long var8 = 270389152141252877L;
                           Ref.h2(270389152141252877L, var8);
                           Object[] var10002 = Registry.emptyArgs();
                           long var11 = 306266403902896148L;
                           Object[] var10 = var10002;
                           Ref.h(306266403902896148L, var10, var11);
                           Object[] var10003 = Registry.emptyArgs();
                           long var13 = 221275956571705390L;
                           Object[] var12 = var10003;
                           var10003 = Ref.h(221275956571705390L, var12, var13);

                           try {
                              var35 = (Integer)var10003;
                           } catch (InvocationTargetException var21) {
                              throw var21.getTargetException();
                           }

                           var3 = var35;
                           if (var2 == 0) {
                              break label225;
                           }
                        }
                     }
                  }

                  var26 = var1.getButton();
               }

               var31 = 3;
            }

            if (var2 != 0) {
               break label201;
            }

            if (var26 == var31) {
               Registry.emptyArgs();
               long var14 = 270389152141252877L;
               Ref.h2(270389152141252877L, var14);
               Object[] var33 = Registry.emptyArgs();
               long var17 = 306266403902896148L;
               Object[] var16 = var33;
               Ref.h(306266403902896148L, var16, var17);
               Object[] var36 = Registry.emptyArgs();
               long var19 = 617094797338525076L;
               Object[] var18 = var36;
               var36 = Ref.h(617094797338525076L, var18, var19);

               try {
                  var38 = (Integer)var36;
               } catch (InvocationTargetException var20) {
                  throw var20.getTargetException();
               }

               var3 = var38;
            }
         }

         var26 = var3;
         var31 = Registry.lookupField(518223218338208363L).getInt(null);
      }

      label231: {
         if (var2 == 0) {
            if (var26 == var31) {
               this.w.A(false);
               if (var2 == 0) {
                  break label231;
               }
            }

            var26 = var3;
            var31 = Registry.lookupField(263914437926532128L).getInt(null);
         }

         if (var2 == 0) {
            if (var26 == var31) {
               this.w.r();
               if (var2 == 0) {
                  break label231;
               }
            }

            var26 = var3;
            var31 = Registry.lookupField(260545218128102666L).getInt(null);
         }

         if (var2 == 0) {
            if (var26 == var31) {
               this.w.y();
               if (var2 == 0) {
                  break label231;
               }
            }

            var26 = var3;
            var31 = Registry.lookupField(529156970726312971L).getInt(null);
         }

         if (var26 == var31) {
            this.w.z(var1.getX(), var1.getY());
         }
      }

      this.w.repaint();
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      int var10000 = ConnectionProperty.y();
      this.w.A = false;
      int var2 = var10000;
      var10000 = (this.w.requestFocusInWindow()) ? 1 : 0;
      if (var2 == 0) {
         this.w.repaint();
         if (SetBackgroundImagePanel.e(this.w) == null) {
            return;
         }

         var10000 = var1.getButton();
      }

      if (var10000 == 1) {
         this.w.K = new XE(var1.getPoint().x, var1.getPoint().y);
         this.w.N$void();
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





