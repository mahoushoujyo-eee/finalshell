package com.finalshell.ui.listener;

import com.finalshell.core.RU3;
import com.finalshell.core.XE;
import com.finalshell.core.Yw2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

public class Wu2 extends MouseAdapter {
   public final SetBackgroundImagePanel O;

   public Wu2(SetBackgroundImagePanel var1) {
      this.O = var1;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      int var2 = ConnectionProperty.M$int();
      if (var2 != 0 && SetBackgroundImagePanel.c(this.O) != null) {
         SetBackgroundImagePanel.c(this.O).a();
         SetBackgroundImagePanel.M(this.O, null);
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Yw2 var30;
      boolean var36;
      Integer var43;
      Integer var46;
      int var2;
      int var28;
      label253: {
         label252: {
            label256: {
               var2 = ConnectionProperty.M$int();
               var28 = var1.getButton();
               byte var10001 = 1;
               if (var2 != 0) {
                  if (var28 == 1) {
                     this.O.x();
                  }

                  var27 = this.O;
                  if (var2 == 0) {
                     break label256;
                  }

                  this.O.M = System.currentTimeMillis();
                  var28 = var1.getButton();
                  var10001 = 1;
               }

               if (var28 == var10001) {
                  this.O.A = true;
                  var28 = var1.getClickCount();
                  if (var2 == 0) {
                     break label253;
                  }

                  if (var28 != 1) {
                     break label252;
                  }

                  SetBackgroundImagePanel.f(this.O, SetBackgroundImagePanel.x(this.O, var1.getPoint()));
                  this.O.V$void();
                  this.O.repaint();
                  if (var2 != 0) {
                     break label252;
                  }
               }

               var27 = this.O;
            }

            var27.A = false;
         }

         var28 = -1;
      }

      int var3;
      label235: {
         var3 = var28;
         this.O.requestFocusInWindow();
         SetBackgroundImagePanel var29 = this.O;
         MouseEvent var38 = var1;
         if (var2 != 0) {
            if (!SetBackgroundImagePanel.D(this.O, var1)) {
               var30 = null;
               break label235;
            }

            var29 = this.O;
            var38 = var1;
         }

         var30 = SetBackgroundImagePanel.C(var29, var38.getPoint());
      }

      int var39;
      label229: {
         label259: {
            label227: {
               Yw2 var4 = var30;
               Yw2 var31 = var4;
               if (var2 != 0) {
                  if (var4 == null) {
                     break label227;
                  }

                  var31 = var4;
               }

               var31.g().v();
               if (var2 != 0) {
                  break label259;
               }
            }

            var28 = var1.getButton();
            var39 = 1;
            if (var2 != 0) {
               label217: {
                  if (var28 == 1) {
                     var28 = (this.O.m(var1)) ? 1 : 0;
                     if (var2 == 0) {
                        break label217;
                     }

                     if (var28 != 0) {
                        label260: {
                           int var5 = var1.getClickCount();
                           var28 = var5;
                           byte var40 = 1;
                           if (var2 != 0) {
                              if (var5 == 1) {
                                 break label260;
                              }

                              var28 = var5;
                              var40 = 2;
                           }

                           if (var2 != 0) {
                              if (var28 == var40) {
                                 label206: {
                                    XE var6 = SetBackgroundImagePanel.x(this.O, var1.getPoint());
                                    XE var7 = com.finalshell.core.A7.t(var6, SetBackgroundImagePanel.T(this.O));
                                    XE var8 = com.finalshell.core.A7.l(var6, SetBackgroundImagePanel.T(this.O));
                                    SetBackgroundImagePanel.t(this.O, new RU3(var7));
                                    SetBackgroundImagePanel.e(this.O).m(var8);
                                    SetBackgroundImagePanel var34 = this.O;
                                    if (var2 != 0) {
                                       if (!SetBackgroundImagePanel.S(this.O).V()) {
                                          break label206;
                                       }

                                       var34 = this.O;
                                    }

                                    SetBackgroundImagePanel.O(var34);
                                 }

                                 if (var2 != 0) {
                                    break label260;
                                 }
                              }

                              var28 = var5;
                              var40 = 3;
                           }

                           label166:
                           if (var28 == var40) {
                              XE var24 = SetBackgroundImagePanel.x(this.O, var1.getPoint());
                              int var25 = var24.r;

                              while (true) {
                                 if (var25 > -this.O.k$ua_2().b()) {
                                    var28 = (SetBackgroundImagePanel.T(this.O).D(var25 - 1).G()) ? 1 : 0;
                                    if (var2 == 0 || var2 == 0) {
                                       break;
                                    }

                                    if (var28 != 0) {
                                       var25--;
                                       if (var2 != 0) {
                                          continue;
                                       }
                                    }
                                 }

                                 var28 = var24.r;
                                 break;
                              }

                              int var26 = var28;

                              label263: {
                                 while (true) {
                                    if (var26 < SetBackgroundImagePanel.T(this.O).O()) {
                                       var36 = SetBackgroundImagePanel.T(this.O).D(var26).G();
                                       if (var2 == 0 || var2 == 0) {
                                          break;
                                       }

                                       if (var36) {
                                          var26++;
                                          if (var2 != 0) {
                                             continue;
                                          }
                                       }
                                    }

                                    SetBackgroundImagePanel.t(this.O, new RU3(new XE(0, var25)));
                                    SetBackgroundImagePanel.e(this.O).m(new XE(this.O.N.R(), var26));
                                    var37 = this.O;
                                    if (var2 == 0) {
                                       break label263;
                                    }

                                    var36 = SetBackgroundImagePanel.S(this.O).V();
                                    break;
                                 }

                                 if (!var36) {
                                    break label166;
                                 }

                                 var37 = this.O;
                              }

                              SetBackgroundImagePanel.O(var37);
                           }
                        }

                        if (var2 != 0) {
                           break label259;
                        }
                     }
                  }

                  var28 = var1.getButton();
               }

               var39 = 2;
            }

            if (var2 != 0) {
               label155: {
                  if (var28 == var39) {
                     var28 = (SetBackgroundImagePanel.S(this.O).x()) ? 1 : 0;
                     if (var2 == 0) {
                        break label155;
                     }

                     if (var28 != 0) {
                        var28 = (this.O.m(var1)) ? 1 : 0;
                        if (var2 == 0) {
                           break label155;
                        }

                        if (var28 != 0) {
                           Registry.emptyArgs();
                           long var9 = 270389152141252877L;
                           Ref.h2(270389152141252877L, var9);
                           Object[] var10002 = Registry.emptyArgs();
                           long var12 = 306266403902896148L;
                           Object[] var11 = var10002;
                           Ref.h(306266403902896148L, var11, var12);
                           Object var10003 = Registry.emptyArgs();
                           long var14 = 221275956571705390L;
                           Object var13 = var10003;
                           var10003 = Ref.h(221275956571705390L, var13, var14);

                           try {
                              var43 = (Integer)var10003;
                           } catch (InvocationTargetException var22) {
                              throw var22.getTargetException();
                           }

                           var3 = var43;
                           if (var2 != 0) {
                              break label259;
                           }
                        }
                     }
                  }

                  var28 = var1.getButton();
               }

               var39 = 3;
            }

            if (var2 == 0) {
               break label229;
            }

            if (var28 == var39) {
               Yw2 var23 = SetBackgroundImagePanel.C(this.O, var1.getPoint());
               Registry.emptyArgs();
               long var15 = 270389152141252877L;
               Ref.h2(270389152141252877L, var15);
               Object[] var41 = Registry.emptyArgs();
               long var18 = 306266403902896148L;
               Object[] var17 = var41;
               Ref.h(306266403902896148L, var17, var18);
               Object var44 = Registry.emptyArgs();
               long var20 = 617094797338525076L;
               Object var19 = var44;
               var44 = Ref.h(617094797338525076L, var19, var20);

               try {
                  var46 = (Integer)var44;
               } catch (InvocationTargetException var21) {
                  throw var21.getTargetException();
               }

               var3 = var46;
            }
         }

         var28 = var3;
         var39 = Registry.lookupField(518223218338208363L).getInt(null);
      }

      label268: {
         if (var2 != 0) {
            if (var28 == var39) {
               this.O.A(false);
               if (var2 != 0) {
                  break label268;
               }
            }

            var28 = var3;
            var39 = Registry.lookupField(263914437926532128L).getInt(null);
         }

         if (var2 != 0) {
            if (var28 == var39) {
               this.O.r();
               if (var2 != 0) {
                  break label268;
               }
            }

            var28 = var3;
            var39 = Registry.lookupField(260545218128102666L).getInt(null);
         }

         if (var2 != 0) {
            if (var28 == var39) {
               this.O.y();
               if (var2 != 0) {
                  break label268;
               }
            }

            var28 = var3;
            var39 = Registry.lookupField(529156970726312971L).getInt(null);
         }

         if (var28 == var39) {
            this.O.z(var1.getX(), var1.getY());
         }
      }

      this.O.repaint();
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      int var2 = ConnectionProperty.y();
      int var10000 = (this.O.requestFocusInWindow()) ? 1 : 0;
      if (var2 == 0) {
         this.O.repaint();
         this.O.A = false;
         if (SetBackgroundImagePanel.e(this.O) == null) {
            return;
         }

         var10000 = var1.getButton();
      }

      if (var10000 == 1) {
         this.O.K = new XE(var1.getPoint().x, var1.getPoint().y);
         this.O.N$void();
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





