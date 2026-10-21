package com;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;

public class DO extends com.A.y_2 implements ActionListener, WindowFocusListener, WindowListener {
   private float F = 0.9F;
   private float f = 0.3F;
   private int w;
   private float z;
   private com.WC T;
   private static final String b;
   private static final long c;

   public DO() {
      this.w = (int)c;
      this.z = 1.0F;
      this.T = new com.WC(b, GO.L, this);
      this.addWindowFocusListener(this);
      this.addWindowListener(this);
   }

   public float E() {
      return this.F;
   }

   public void c(float var1) {
      this.F = var1;
   }

   public float v() {
      return this.f;
   }

   public void r(float var1) {
      this.f = var1;
   }

   public int g() {
      return this.w;
   }

   public void G(int var1) {
      this.w = var1;
   }

   @Override
   public void windowGainedFocus(WindowEvent var1) {
      this.T.Y();
      this.z = this.F;
      this.g();
   }

   @Override
   public void windowLostFocus(WindowEvent var1) {
      int[] var2 = com.Ds_2.U();
      com.DO var10000 = this;
      if (var2 == null) {
         if (!this.isShowing()) {
            return;
         }

         var10000 = this;
      }

      var10000.T.u();
   }

   @Override
   public void windowOpened(WindowEvent var1) {
   }

   @Override
   public void windowClosed(WindowEvent var1) {
      this.T.Y();
   }

   @Override
   public void windowClosing(WindowEvent var1) {
   }

   @Override
   public void windowIconified(WindowEvent var1) {
   }

   @Override
   public void windowDeiconified(WindowEvent var1) {
   }

   @Override
   public void windowActivated(WindowEvent var1) {
   }

   @Override
   public void windowDeactivated(WindowEvent var1) {
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var3;
      label105: {
         int[] var2 = com.Ds_2.U();
         com.DO var10000 = this;
         if (var2 == null) {
            if (!this.isActive()) {
               label109: {
                  Point var4 = MouseInfo.getPointerInfo().getLocation();
                  Rectangle var5 = this.getBounds();
                  int var7 = var5.contains(var4);
                  if (var2 == null) {
                     if (var7 != 0) {
                        var3 = this.F;
                        if (var2 == null) {
                           break label109;
                        }
                     }

                     var7 = var4.y;
                  }

                  int var6;
                  label110: {
                     int var10001 = var5.y;
                     if (var2 == null) {
                        if (var7 < var5.y) {
                           int var8 = var4.x;
                           var10001 = var5.x;
                           if (var2 == null) {
                              if (var4.x < var5.x) {
                                 var6 = this.w - Gw_2.t((double)(Gw_2.t(var5.y - var4.y) + Gw_2.t(var5.x - var4.x)));
                                 if (var2 == null) {
                                    break label110;
                                 }
                              }

                              var8 = var4.x;
                              var10001 = var5.x + var5.width;
                           }

                           if (var2 == null) {
                              if (var8 > var10001) {
                                 var6 = this.w - Gw_2.t((double)(Gw_2.t(var5.y - var4.y) + Gw_2.t(var4.x - var5.x - var5.width)));
                                 if (var2 == null) {
                                    break label110;
                                 }
                              }

                              var8 = this.w;
                              var10001 = var5.y - var4.y;
                           }

                           var6 = var8 - var10001;
                           if (var2 == null) {
                              break label110;
                           }
                        }

                        var7 = var4.y;
                        var10001 = var5.y;
                     }

                     label91:
                     if (var2 == null) {
                        if (var7 > var10001) {
                           var7 = var4.y;
                           var10001 = var5.y + var5.height;
                           if (var2 != null) {
                              break label91;
                           }

                           if (var4.y < var10001) {
                              int var9 = var4.x;
                              var10001 = var5.x;
                              if (var2 == null) {
                                 if (var4.x < var5.x) {
                                    var6 = this.w - (var5.x - var4.x);
                                    if (var2 == null) {
                                       break label110;
                                    }
                                 }

                                 var9 = this.w;
                                 var10001 = var4.x - var5.x - var5.width;
                              }

                              var6 = var9 - var10001;
                              if (var2 == null) {
                                 break label110;
                              }
                           }
                        }

                        var7 = var4.x;
                        var10001 = var5.x;
                     }

                     if (var2 == null) {
                        if (var7 < var10001) {
                           var6 = this.w - Gw_2.t((double)(Gw_2.t(var4.y - var5.y - var5.height) + Gw_2.t(var5.x - var4.x)));
                           if (var2 == null) {
                              break label110;
                           }
                        }

                        var7 = var4.x;
                        var10001 = var5.x + var5.width;
                     }

                     if (var2 == null) {
                        if (var7 > var10001) {
                           var6 = this.w - Gw_2.t((double)(Gw_2.t(var4.y - var5.y - var5.height) + Gw_2.t(var4.x - var5.x - var5.width)));
                           if (var2 == null) {
                              break label110;
                           }
                        }

                        var7 = this.w;
                        var10001 = var4.y - var5.y - var5.height;
                     }

                     var6 = var7 - var10001;
                  }

                  var3 = this.f + (this.F - this.f) * ((float)Math.max(0, var6) / (float)this.w);
               }

               if (var2 == null) {
                  break label105;
               }
            }

            var10000 = this;
         }

         var3 = var10000.F;
      }

      if (var3 != this.z) {
         this.z = var3;
         this.g();
      }
   }

   private void g$void() {
      this.v(this.z);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = ")\u0006WuB~\\:\nT_L}\u0017\u000b\u0013QRW\u007fK".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 19;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 19;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 109;
               break;
            case 1:
               var21 = 112;
               break;
            case 2:
               var21 = 38;
               break;
            case 3:
               var21 = 32;
               break;
            case 4:
               var21 = 48;
               break;
            case 5:
               var21 = 9;
               break;
            default:
               var21 = 42;
         }
      } else {
         var13 = 19;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            b = var16;
            long var3 = 5353804280115467894L;
            long var12 = 7040471480949249726L ^ var3;
            var8 = -1;
            c = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 19;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 109;
               break;
            case 1:
               var21 = 112;
               break;
            case 2:
               var21 = 38;
               break;
            case 3:
               var21 = 32;
               break;
            case 4:
               var21 = 48;
               break;
            case 5:
               var21 = 9;
               break;
            default:
               var21 = 42;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 109;
                  break;
               case 1:
                  var21 = 112;
                  break;
               case 2:
                  var21 = 38;
                  break;
               case 3:
                  var21 = 32;
                  break;
               case 4:
                  var21 = 48;
                  break;
               case 5:
                  var21 = 9;
                  break;
               default:
                  var21 = 42;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               b = var15;
               long var0 = 5353804280115467894L;
               long var11 = 7040471480949249726L ^ var0;
               var6 = -1;
               c = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 109;
                  break;
               case 1:
                  var21 = 112;
                  break;
               case 2:
                  var21 = 38;
                  break;
               case 3:
                  var21 = 32;
                  break;
               case 4:
                  var21 = 48;
                  break;
               case 5:
                  var21 = 9;
                  break;
               default:
                  var21 = 42;
            }
         }
      }
   }
}





