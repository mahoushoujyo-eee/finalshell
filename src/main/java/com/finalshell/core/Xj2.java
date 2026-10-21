package com.finalshell.core;

import com.finalshell.ui.model.DR3;
import com.finalshell.ui.model.O62;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.XW;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;

public class Xj2 extends Xv2 {
   public int J;
   public int i;
   public int m;
   public boolean N;
   public O62 G;
   public DR3 n;
   public com.finalshell.ui.model.I3 y;
   public int[] b;
   public Shape l;
   public static String[] a;
   public static String[] d;
   public static long e;

   public int S() {
      return (Integer)this.C(b(-25488, 13363), Integer.valueOf((int)e));
   }

   public void E(int var1) {
      this.Y(b(-25479, -23085), Integer.valueOf(var1));
   }

   public int M() {
      return (Integer)this.C(b(-25480, 1673), Integer.valueOf(1));
   }

   public void q(int var1) {
      this.Y(b(-25474, -12210), Integer.valueOf(var1));
   }

   public int I() {
      return (Integer)this.C(b(-25486, 20291), Integer.valueOf(4));
   }

   public void v(int var1) {
      this.Y(b(-25473, 8082), Integer.valueOf(var1));
   }

   public boolean B() {
      return (Boolean)this.C(b(-25475, 4956), Boolean.valueOf(true));
   }

   public void h(boolean var1) {
      this.Y(b(-25478, 29530), Boolean.valueOf(var1));
   }

   public O62 L() {
      return (O62)this.C(b(-25476, -31629), O62.random);
   }

   public void P(O62 var1) {
      this.Y(b(-25487, 16191), var1);
   }

   public com.finalshell.ui.model.I3 q() {
      return (com.finalshell.ui.model.I3)this.C(b(-25485, 24426), com.finalshell.ui.model.I3.random);
   }

   public void T(com.finalshell.ui.model.I3 var1) {
      this.Y(b(-25477, -23412), var1);
   }

   @Override
   public void X(XW var1) {
      Xj2 var10;
      int var8;
      String[] var10000 = O62.S();
      this.J = this.S();
      this.i = this.M();
      this.m = this.I();
      this.N = this.B();
      this.G = NG.F(this.L());
      this.n = NG.q(this.A());
      String[] var2 = var10000;
      this.y = NG.R(this.q());
      int var6 = (this.n.Z()) ? 1 : 0;
      if (var2 == null) {
         var6 = var6 != 0 ? var1.getHeight() : var1.getWidth();
      }

      label69: {
         int var3 = var6;
         int var7 = var3 % this.J;
         if (var2 == null) {
            if (var7 == 0) {
               var8 = var3;
               break label69;
            }

            var7 = var3 / this.J * this.J;
         }

         var8 = var7 + this.J;
      }

      int var4 = var8 / this.J;
      this.b = new int[var4];
      int var5 = 0;

      label62: {
         label61: {
            label60: {
               while (true) {
                  if (var5 < var4) {
                     this.b[var5] = 0;
                     var5++;
                     if (var2 != null) {
                        break;
                     }

                     if (var2 == null) {
                        continue;
                     }

                     Ky4.K(new String[4]);
                  }

                  Xj2 var9 = this;
                  if (var2 == null) {
                     if (!this.n.equals(DR3.right)) {
                        var10 = this;
                        if (var2 != null) {
                           break label61;
                        }

                        if (!this.n.equals(DR3.down)) {
                           break label60;
                        }
                     }

                     var9 = this;
                  }

                  var9.b[0] = this.m(var1, 0);
                  break;
               }

               if (var2 == null) {
                  break label62;
               }
            }

            var10 = this;
         }

         var10.b[var4 - 1] = this.m(var1, 0);
      }

      label39: {
         Xj2 var11 = this;
         if (var2 == null) {
            if (!this.G.equals(O62.fill)) {
               break label39;
            }

            var11 = this;
         }

         var11.l = this.P(this.b, var1);
      }

      var1.repaint();
   }

   @Override
   public boolean d(XW var1) {
      int var7;
      int var3 = this.Y(var1);
      String[] var10000 = O62.S();
      int var4 = 1;
      String[] var2 = var10000;
      int var5 = this.b.length;
      int var6 = 0;

      while (true) {
         if (var6 < var5) {
            var7 = this.b[var6];
            if (var2 != null) {
               break;
            }

            label81: {
               if (var2 == null) {
                  if (var7 >= var3) {
                     break label81;
                  }

                  var7 = this.b[var6];
               }

               label69: {
                  label82: {
                     if (var2 == null) {
                        if (var7 > 0) {
                           this.b[var6] = this.m(var1, this.b[var6]);
                           if (var2 == null) {
                              break label82;
                           }
                        }

                        var7 = (this.E(var6, this.b, var3)) ? 1 : 0;
                     }

                     if (var2 != null) {
                        break label69;
                     }

                     if (var7 != 0) {
                        this.b[var6] = this.m(var1, this.b[var6]);
                     }
                  }

                  var7 = var4;
               }

               if (var2 == null) {
                  if (var7 == 0) {
                     break label81;
                  }

                  var7 = this.b[var6];
               }

               if (var2 == null) {
                  if (var7 >= var3) {
                     break label81;
                  }

                  var7 = 0;
               }

               var4 = var7;
            }

            var6++;
            if (var2 == null) {
               continue;
            }
         }

         var7 = (this.G.equals(O62.fill)) ? 1 : 0;
         break;
      }

      if (var2 == null) {
         if (var7 != 0) {
            this.l = this.P(this.b, var1);
         }

         var7 = var4;
      }

      if (var2 == null) {
         if (var7 == 0) {
            var1.repaint();
            return false;
         }

         this.l = null;
         this.G = null;
         var7 = 1;
      }

      return var7 != 0;
   }

   public int m(XW var1, int var2) {
      int var3 = this.Y(var1);
      return Math.min(var2 + this.c(var2, var3), var3);
   }

   public int Y(XW var1) {
      String[] var2 = O62.S();
      int var10000 = (this.G.equals(O62.slide)) ? 1 : 0;
      if (var2 == null) {
         if (var10000 != 0) {
            var10000 = (this.n.V()) ? 1 : 0;
            if (var2 == null) {
               var10000 = var10000 != 0 ? var1.getHeight() : var1.getWidth();
            }

            return var10000;
         }

         var10000 = this.J;
      }

      return var10000;
   }

   public int c(int var1, int var2) {
      String[] var3 = O62.S();
      int var10000 = (this.G.equals(O62.slide)) ? 1 : 0;
      if (var3 == null) {
         if (var10000 != 0) {
            return Math.max(this.i, Math.round((float)this.m * (float)Math.sqrt((double)((float)(var2 - var1) / (float)var2))));
         }

         var10000 = this.m;
      }

      return var10000;
   }

   public boolean E(int var1, int[] var2, int var3) {
      String[] var4;
      int var5;
      label140: {
         var4 = O62.S();
         var5 = (this.n.equals(DR3.right)) ? 1 : 0;
         if (var4 == null) {
            if (var5 == 0) {
               var5 = (this.n.equals(DR3.down)) ? 1 : 0;
               if (var4 != null) {
                  break label140;
               }

               if (var5 == 0) {
                  var5 = var1;
                  break label140;
               }
            }

            var5 = var1;
         }

         if (var4 == null) {
            if (var5 > 0) {
               var5 = var2[var1 - 1];
               if (var4 != null) {
                  return var5 != 0;
               }

               if (var5 > var3 / 4) {
                  return 1 != 0;
               }
            }

            var5 = var1;
         }

         int var10001 = 1;
         if (var4 == null) {
            if (var5 > 1) {
               var5 = var2[var1 - 2];
               if (var4 != null) {
                  return var5 != 0;
               }

               if (var5 > var3 * 2 / 4) {
                  return 1 != 0;
               }
            }

            var5 = var1;
            var10001 = 2;
         }

         if (var4 == null) {
            if (var5 <= var10001) {
               return 0 != 0;
            }

            var5 = var2[var1 - 3];
            if (var4 != null) {
               return var5 != 0;
            }

            var10001 = var3 * 3 / 4;
         }

         if (var5 > var10001) {
            return 1 != 0;
         }

         return 0 != 0;
      }

      int var6 = var2.length - 1;
      if (var4 == null) {
         if (var5 < var6) {
            var5 = var2[var1 + 1];
            if (var4 != null) {
               return var5 != 0;
            }

            if (var5 > var3 / 4) {
               return 1 != 0;
            }
         }

         var5 = var1;
         var6 = var2.length - 2;
      }

      if (var4 == null) {
         if (var5 < var6) {
            var5 = var2[var1 + 2];
            if (var4 != null) {
               return var5 != 0;
            }

            if (var5 > var3 * 2 / 4) {
               return 1 != 0;
            }
         }

         var5 = var1;
         var6 = var2.length - 3;
      }

      if (var4 == null) {
         if (var5 >= var6) {
            return 0 != 0;
         }

         var5 = var2[var1 + 3];
         if (var4 != null) {
            return var5 != 0;
         }

         var6 = var3 * 3 / 4;
      }

      return (boolean)((var5 > var6 ? 1 : 0) != 0);
   }

   public Shape P(int[] var1, XW var2) {
      String[] var10000 = O62.S();
      GeneralPath var4 = new GeneralPath(0);
      int var5 = 0;
      String[] var3 = var10000;

      while (var5 < var1.length) {
         label17: {
            if (this.n.Z()) {
               var4.append(new Rectangle(0, var5 * this.J, var2.getWidth(), var1[var5]), false);
               if (var3 == null) {
                  break label17;
               }
            }

            var4.append(new Rectangle(var5 * this.J, 0, var1[var5], var2.getHeight()), false);
         }

         var5++;
         if (var3 != null) {
            break;
         }
      }

      return var4;
   }

   @Override
   public void D(Graphics2D var1, XW var2) {
      int var10;
      Xj2 var10001;
      int var23;
      Xj2 var52;
      label355: {
         String[] var3;
         int var4;
         int var5;
         int var6;
         BufferedImage var7;
         int var40;
         label351: {
            label356: {
               var4 = var2.getWidth();
               var5 = var2.getHeight();
               String[] var10000 = O62.S();
               var6 = this.Y(var2);
               var3 = var10000;
               var1.drawImage(var2.R$BufferedImage(), 0, 0, var4, var5, null);
               var7 = var2.y();
               var40 = (this.G.equals(O62.fade)) ? 1 : 0;
               if (var3 == null) {
                  if (var40 == 0) {
                     var40 = (this.G.equals(O62.fill)) ? 1 : 0;
                     if (var3 != null) {
                        break label351;
                     }

                     if (var40 == 0) {
                        break label356;
                     }

                     var40 = (this.N) ? 1 : 0;
                     if (var3 != null) {
                        break label351;
                     }

                     if (!this.N) {
                        break label356;
                     }
                  }

                  var40 = this.b.length;
               }

               int var8 = var40;
               int var9 = 0;

               while (var9 < var8) {
                  var10 = this.b[var9];
                  if (var3 != null) {
                     break label355;
                  }

                  if (var3 == null) {
                     label306:
                     if (var10 > 0) {
                        var40 = (this.n.Z()) ? 1 : 0;
                        if (var3 == null) {
                           if (var40 != 0) {
                              int var12;
                              int var50;
                              label327: {
                                 boolean var11 = false;
                                 var12 = var9 * this.J;
                                 var40 = var5 - var9 * this.J;
                                 var10001 = this;
                                 label326:
                                 if (var3 == null) {
                                    if (this.G.equals(O62.fill)) {
                                       var10001 = this;
                                       if (var3 != null) {
                                          break label326;
                                       }

                                       if (this.N) {
                                          var50 = var10;
                                          break label327;
                                       }
                                    }

                                    var10001 = this;
                                 }

                                 var50 = var10001.J;
                              }

                              int var13 = Math.min(var40, var50);
                              int var14 = 0 + var4;
                              int var15 = var12 + var13;
                              Float var51 = (float)var10 / (float)this.J;
                              int var10002 = var10;
                              if (var3 == null) {
                                 var10002 = var10 < this.J ? 1 : 0;
                              }

                              Composite var16 = RV.a(var1, var51, var10002);
                              var1.drawImage(var7, 0, var12, var14, var15, 0, var12, var14, var15, null);
                              var10002 = var10;
                              if (var3 == null) {
                                 var10002 = var10 < this.J ? 1 : 0;
                              }

                              RV.E(var1, var16, var10002);
                              if (var3 == null) {
                                 break label306;
                              }
                           }

                           var40 = var9 * this.J;
                        }

                        int var21;
                        int var53;
                        label315: {
                           var21 = var40;
                           boolean var24 = false;
                           var40 = var4 - var9 * this.J;
                           var52 = this;
                           label314:
                           if (var3 == null) {
                              if (this.G.equals(O62.fill)) {
                                 var52 = this;
                                 if (var3 != null) {
                                    break label314;
                                 }

                                 if (this.N) {
                                    var53 = var10;
                                    break label315;
                                 }
                              }

                              var52 = this;
                           }

                           var53 = var52.J;
                        }

                        int var27 = Math.min(var40, var53);
                        int var30 = var21 + var27;
                        int var33 = 0 + var5;
                        Float var54 = (float)var10 / (float)this.J;
                        int var58 = var10;
                        if (var3 == null) {
                           var58 = var10 < this.J ? 1 : 0;
                        }

                        Composite var36 = RV.a(var1, var54, var58);
                        var1.drawImage(var7, var21, 0, var30, var33, var21, 0, var30, var33, null);
                        var58 = var10;
                        if (var3 == null) {
                           var58 = var10 < this.J ? 1 : 0;
                        }

                        RV.E(var1, var36, var58);
                     }

                     var9++;
                  }

                  if (var3 != null) {
                     break;
                  }
               }

               if (var3 == null) {
                  break label355;
               }
            }

            var40 = (this.G.equals(O62.fill)) ? 1 : 0;
         }

         if (var3 == null) {
            if (var40 != 0) {
               Shape var17 = RV.n(var1, this.l);
               var1.drawImage(var7, 0, 0, var4, var5, null);
               RV.w(var1, var17);
               if (var3 == null) {
                  break label355;
               }
            }

            var40 = (this.G.equals(O62.slide)) ? 1 : 0;
         }

         if (var3 == null) {
            if (var40 == 0) {
               break label355;
            }

            var40 = this.b.length;
         }

         int var18 = var40;
         int var19 = 0;

         while (var19 < var18) {
            int var20 = this.b[var19];
            if (var3 == null) {
               label191:
               if (var20 > 0) {
                  var40 = (this.n.Z()) ? 1 : 0;
                  if (var3 == null) {
                     if (var40 != 0) {
                        int var22;
                        label364: {
                           var40 = (this.y.equals(com.finalshell.ui.model.I3.left)) ? 1 : 0;
                           if (var3 == null) {
                              if (var40 != 0) {
                                 var40 = (this.n.equals(DR3.up)) ? 1 : 0;
                                 if (var3 == null) {
                                    var40 = var40 != 0 ? -1 : 1;
                                 }

                                 var22 = var40;
                                 if (var3 == null) {
                                    break label364;
                                 }
                              }

                              var40 = (this.y.equals(com.finalshell.ui.model.I3.right)) ? 1 : 0;
                           }

                           if (var3 == null) {
                              if (var40 != 0) {
                                 var40 = (this.n.equals(DR3.up)) ? 1 : 0;
                                 if (var3 == null) {
                                    var40 = var40 != 0 ? 1 : -1;
                                 }

                                 var22 = var40;
                                 if (var3 == null) {
                                    break label364;
                                 }
                              }

                              var40 = var19 % 2;
                           }

                           if (var3 == null) {
                              var40 = var40 == 0 ? 1 : -1;
                           }

                           var22 = var40;
                        }

                        int var25;
                        int var28;
                        int var31;
                        int var34;
                        Float var55;
                        int var60;
                        label251: {
                           label365: {
                              var25 = var22 * Math.round((float)var4 * ((float)var20 / (float)var6)) - var22 * var4;
                              var28 = var25 + var4;
                              var31 = var19 * this.J;
                              var34 = var31 + Math.min(var5 - var19 * this.J, this.J);
                              var55 = (float)var20 / (float)var6;
                              var60 = (this.N) ? 1 : 0;
                              if (var3 == null) {
                                 if (!this.N) {
                                    break label365;
                                 }

                                 var60 = var20;
                              }

                              if (var3 != null) {
                                 break label251;
                              }

                              if (var60 < var6) {
                                 var60 = 1;
                                 break label251;
                              }
                           }

                           var60 = 0;
                        }

                        Composite var37;
                        label240: {
                           label366: {
                              var37 = (RV.a(var1, var55, var60)) != 0;
                              var1.drawImage(var7, var25, var31, var28, var34, 0, var31, var4, var34, null);
                              var60 = (this.N) ? 1 : 0;
                              if (var3 == null) {
                                 if (!this.N) {
                                    break label366;
                                 }

                                 var60 = var20;
                              }

                              if (var3 != null) {
                                 break label240;
                              }

                              if (var60 < var6) {
                                 var60 = 1;
                                 break label240;
                              }
                           }

                           var60 = 0;
                        }

                        RV.E(var1, var37, var60);
                        if (var3 == null) {
                           break label191;
                        }
                     }

                     var40 = (this.y.equals(com.finalshell.ui.model.I3.left)) ? 1 : 0;
                  }

                  label367: {
                     if (var3 == null) {
                        if (var40 != 0) {
                           var40 = (this.n.equals(DR3.left)) ? 1 : 0;
                           if (var3 == null) {
                              var40 = var40 != 0 ? -1 : 1;
                           }

                           var23 = var40;
                           if (var3 == null) {
                              break label367;
                           }
                        }

                        var40 = (this.y.equals(com.finalshell.ui.model.I3.right)) ? 1 : 0;
                     }

                     if (var3 == null) {
                        if (var40 != 0) {
                           var40 = (this.n.equals(DR3.left)) ? 1 : 0;
                           if (var3 == null) {
                              var40 = var40 != 0 ? 1 : -1;
                           }

                           var23 = var40;
                           if (var3 == null) {
                              break label367;
                           }
                        }

                        var40 = var19 % 2;
                     }

                     if (var3 == null) {
                        var40 = var40 == 0 ? 1 : -1;
                     }

                     var23 = var40;
                  }

                  int var26;
                  int var29;
                  int var32;
                  int var35;
                  Float var56;
                  int var62;
                  label212: {
                     label368: {
                        var26 = var19 * this.J;
                        var29 = var26 + Math.min(var4 - var19 * this.J, this.J);
                        var32 = var23 * Math.round((float)var5 * ((float)var20 / (float)var6)) - var23 * var5;
                        var35 = var32 + var5;
                        var56 = (float)var20 / (float)var6;
                        var62 = (this.N) ? 1 : 0;
                        if (var3 == null) {
                           if (!this.N) {
                              break label368;
                           }

                           var62 = var20;
                        }

                        if (var3 != null) {
                           break label212;
                        }

                        if (var62 < var6) {
                           var62 = 1;
                           break label212;
                        }
                     }

                     var62 = 0;
                  }

                  Composite var38;
                  label201: {
                     label369: {
                        var38 = (RV.a(var1, var56, var62)) != 0;
                        var1.drawImage(var7, var26, var32, var29, var35, var26, 0, var29, var5, null);
                        var62 = (this.N) ? 1 : 0;
                        if (var3 == null) {
                           if (!this.N) {
                              break label369;
                           }

                           var62 = var20;
                        }

                        if (var3 != null) {
                           break label201;
                        }

                        if (var62 < var6) {
                           var62 = 1;
                           break label201;
                        }
                     }

                     var62 = 0;
                  }

                  RV.E(var1, var38, var62);
               }

               var19++;
            }

            if (var3 != null) {
               break;
            }
         }
      }

      if (Ky4.F$arrString() != null) {
         O62.R(new String[4]);
      }
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var8;
      int var2 = (var0 ^ -25479) & 65535;
      if (d[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 111;
               break;
            case 1:
               var10000 = 238;
               break;
            case 2:
               var10000 = 66;
               break;
            case 3:
               var10000 = 249;
               break;
            case 4:
               var10000 = 250;
               break;
            case 5:
               var10000 = 201;
               break;
            case 6:
               var10000 = 218;
               break;
            case 7:
               var10000 = 1;
               break;
            case 8:
               var10000 = 51;
               break;
            case 9:
               var10000 = 4;
               break;
            case 10:
               var10000 = 122;
               break;
            case 11:
               var10000 = 42;
               break;
            case 12:
               var10000 = 230;
               break;
            case 13:
               var10000 = 68;
               break;
            case 14:
               var10000 = 169;
               break;
            case 15:
               var10000 = 0;
               break;
            case 16:
               var10000 = 234;
               break;
            case 17:
               var10000 = 237;
               break;
            case 18:
               var10000 = 131;
               break;
            case 19:
               var10000 = 166;
               break;
            case 20:
               var10000 = 40;
               break;
            case 21:
               var10000 = 78;
               break;
            case 22:
               var10000 = 89;
               break;
            case 23:
               var10000 = 76;
               break;
            case 24:
               var10000 = 113;
               break;
            case 25:
               var10000 = 188;
               break;
            case 26:
               var10000 = 124;
               break;
            case 27:
               var10000 = 223;
               break;
            case 28:
               var10000 = 32;
               break;
            case 29:
               var10000 = 182;
               break;
            case 30:
               var10000 = 123;
               break;
            case 31:
               var10000 = 38;
               break;
            case 32:
               var10000 = 107;
               break;
            case 33:
               var10000 = 80;
               break;
            case 34:
               var10000 = 9;
               break;
            case 35:
               var10000 = 168;
               break;
            case 36:
               var10000 = 100;
               break;
            case 37:
               var10000 = 19;
               break;
            case 38:
               var10000 = 75;
               break;
            case 39:
               var10000 = 152;
               break;
            case 40:
               var10000 = 118;
               break;
            case 41:
               var10000 = 50;
               break;
            case 42:
               var10000 = 2;
               break;
            case 43:
               var10000 = 208;
               break;
            case 44:
               var10000 = 27;
               break;
            case 45:
               var10000 = 253;
               break;
            case 46:
               var10000 = 195;
               break;
            case 47:
               var10000 = 103;
               break;
            case 48:
               var10000 = 171;
               break;
            case 49:
               var10000 = 232;
               break;
            case 50:
               var10000 = 141;
               break;
            case 51:
               var10000 = 175;
               break;
            case 52:
               var10000 = 252;
               break;
            case 53:
               var10000 = 10;
               break;
            case 54:
               var10000 = 156;
               break;
            case 55:
               var10000 = 41;
               break;
            case 56:
               var10000 = 184;
               break;
            case 57:
               var10000 = 102;
               break;
            case 58:
               var10000 = 39;
               break;
            case 59:
               var10000 = 49;
               break;
            case 60:
               var10000 = 6;
               break;
            case 61:
               var10000 = 110;
               break;
            case 62:
               var10000 = 164;
               break;
            case 63:
               var10000 = 70;
               break;
            case 64:
               var10000 = 170;
               break;
            case 65:
               var10000 = 172;
               break;
            case 66:
               var10000 = 30;
               break;
            case 67:
               var10000 = 95;
               break;
            case 68:
               var10000 = 245;
               break;
            case 69:
               var10000 = 73;
               break;
            case 70:
               var10000 = 77;
               break;
            case 71:
               var10000 = 229;
               break;
            case 72:
               var10000 = 247;
               break;
            case 73:
               var10000 = 17;
               break;
            case 74:
               var10000 = 94;
               break;
            case 75:
               var10000 = 53;
               break;
            case 76:
               var10000 = 48;
               break;
            case 77:
               var10000 = 198;
               break;
            case 78:
               var10000 = 174;
               break;
            case 79:
               var10000 = 28;
               break;
            case 80:
               var10000 = 233;
               break;
            case 81:
               var10000 = 153;
               break;
            case 82:
               var10000 = 129;
               break;
            case 83:
               var10000 = 197;
               break;
            case 84:
               var10000 = 242;
               break;
            case 85:
               var10000 = 45;
               break;
            case 86:
               var10000 = 63;
               break;
            case 87:
               var10000 = 56;
               break;
            case 88:
               var10000 = 151;
               break;
            case 89:
               var10000 = 192;
               break;
            case 90:
               var10000 = 82;
               break;
            case 91:
               var10000 = 106;
               break;
            case 92:
               var10000 = 225;
               break;
            case 93:
               var10000 = 231;
               break;
            case 94:
               var10000 = 35;
               break;
            case 95:
               var10000 = 185;
               break;
            case 96:
               var10000 = 203;
               break;
            case 97:
               var10000 = 37;
               break;
            case 98:
               var10000 = 143;
               break;
            case 99:
               var10000 = 81;
               break;
            case 100:
               var10000 = 121;
               break;
            case 101:
               var10000 = 132;
               break;
            case 102:
               var10000 = 108;
               break;
            case 103:
               var10000 = 54;
               break;
            case 104:
               var10000 = 187;
               break;
            case 105:
               var10000 = 239;
               break;
            case 106:
               var10000 = 3;
               break;
            case 107:
               var10000 = 112;
               break;
            case 108:
               var10000 = 179;
               break;
            case 109:
               var10000 = 206;
               break;
            case 110:
               var10000 = 34;
               break;
            case 111:
               var10000 = 5;
               break;
            case 112:
               var10000 = 140;
               break;
            case 113:
               var10000 = 59;
               break;
            case 114:
               var10000 = 101;
               break;
            case 115:
               var10000 = 58;
               break;
            case 116:
               var10000 = 87;
               break;
            case 117:
               var10000 = 183;
               break;
            case 118:
               var10000 = 29;
               break;
            case 119:
               var10000 = 148;
               break;
            case 120:
               var10000 = 21;
               break;
            case 121:
               var10000 = 24;
               break;
            case 122:
               var10000 = 90;
               break;
            case 123:
               var10000 = 136;
               break;
            case 124:
               var10000 = 22;
               break;
            case 125:
               var10000 = 67;
               break;
            case 126:
               var10000 = 97;
               break;
            case 127:
               var10000 = 216;
               break;
            case 128:
               var10000 = 109;
               break;
            case 129:
               var10000 = 104;
               break;
            case 130:
               var10000 = 155;
               break;
            case 131:
               var10000 = 18;
               break;
            case 132:
               var10000 = 190;
               break;
            case 133:
               var10000 = 226;
               break;
            case 134:
               var10000 = 44;
               break;
            case 135:
               var10000 = 138;
               break;
            case 136:
               var10000 = 204;
               break;
            case 137:
               var10000 = 71;
               break;
            case 138:
               var10000 = 167;
               break;
            case 139:
               var10000 = 55;
               break;
            case 140:
               var10000 = 173;
               break;
            case 141:
               var10000 = 178;
               break;
            case 142:
               var10000 = 219;
               break;
            case 143:
               var10000 = 31;
               break;
            case 144:
               var10000 = 33;
               break;
            case 145:
               var10000 = 120;
               break;
            case 146:
               var10000 = 160;
               break;
            case 147:
               var10000 = 65;
               break;
            case 148:
               var10000 = 127;
               break;
            case 149:
               var10000 = 147;
               break;
            case 150:
               var10000 = 64;
               break;
            case 151:
               var10000 = 212;
               break;
            case 152:
               var10000 = 69;
               break;
            case 153:
               var10000 = 114;
               break;
            case 154:
               var10000 = 207;
               break;
            case 155:
               var10000 = 117;
               break;
            case 156:
               var10000 = 163;
               break;
            case 157:
               var10000 = 221;
               break;
            case 158:
               var10000 = 222;
               break;
            case 159:
               var10000 = 91;
               break;
            case 160:
               var10000 = 144;
               break;
            case 161:
               var10000 = 133;
               break;
            case 162:
               var10000 = 116;
               break;
            case 163:
               var10000 = 12;
               break;
            case 164:
               var10000 = 165;
               break;
            case 165:
               var10000 = 161;
               break;
            case 166:
               var10000 = 125;
               break;
            case 167:
               var10000 = 228;
               break;
            case 168:
               var10000 = 119;
               break;
            case 169:
               var10000 = 62;
               break;
            case 170:
               var10000 = 217;
               break;
            case 171:
               var10000 = 180;
               break;
            case 172:
               var10000 = 248;
               break;
            case 173:
               var10000 = 149;
               break;
            case 174:
               var10000 = 134;
               break;
            case 175:
               var10000 = 196;
               break;
            case 176:
               var10000 = 142;
               break;
            case 177:
               var10000 = 47;
               break;
            case 178:
               var10000 = 177;
               break;
            case 179:
               var10000 = 213;
               break;
            case 180:
               var10000 = 8;
               break;
            case 181:
               var10000 = 244;
               break;
            case 182:
               var10000 = 209;
               break;
            case 183:
               var10000 = 215;
               break;
            case 184:
               var10000 = 193;
               break;
            case 185:
               var10000 = 92;
               break;
            case 186:
               var10000 = 25;
               break;
            case 187:
               var10000 = 145;
               break;
            case 188:
               var10000 = 157;
               break;
            case 189:
               var10000 = 224;
               break;
            case 190:
               var10000 = 99;
               break;
            case 191:
               var10000 = 60;
               break;
            case 192:
               var10000 = 200;
               break;
            case 193:
               var10000 = 158;
               break;
            case 194:
               var10000 = 115;
               break;
            case 195:
               var10000 = 43;
               break;
            case 196:
               var10000 = 36;
               break;
            case 197:
               var10000 = 16;
               break;
            case 198:
               var10000 = 189;
               break;
            case 199:
               var10000 = 191;
               break;
            case 200:
               var10000 = 235;
               break;
            case 201:
               var10000 = 251;
               break;
            case 202:
               var10000 = 20;
               break;
            case 203:
               var10000 = 246;
               break;
            case 204:
               var10000 = 135;
               break;
            case 205:
               var10000 = 26;
               break;
            case 206:
               var10000 = 211;
               break;
            case 207:
               var10000 = 86;
               break;
            case 208:
               var10000 = 57;
               break;
            case 209:
               var10000 = 181;
               break;
            case 210:
               var10000 = 11;
               break;
            case 211:
               var10000 = 13;
               break;
            case 212:
               var10000 = 83;
               break;
            case 213:
               var10000 = 93;
               break;
            case 214:
               var10000 = 159;
               break;
            case 215:
               var10000 = 84;
               break;
            case 216:
               var10000 = 85;
               break;
            case 217:
               var10000 = 176;
               break;
            case 218:
               var10000 = 15;
               break;
            case 219:
               var10000 = 241;
               break;
            case 220:
               var10000 = 162;
               break;
            case 221:
               var10000 = 23;
               break;
            case 222:
               var10000 = 205;
               break;
            case 223:
               var10000 = 96;
               break;
            case 224:
               var10000 = 128;
               break;
            case 225:
               var10000 = 46;
               break;
            case 226:
               var10000 = 255;
               break;
            case 227:
               var10000 = 88;
               break;
            case 228:
               var10000 = 14;
               break;
            case 229:
               var10000 = 150;
               break;
            case 230:
               var10000 = 243;
               break;
            case 231:
               var10000 = 74;
               break;
            case 232:
               var10000 = 240;
               break;
            case 233:
               var10000 = 137;
               break;
            case 234:
               var10000 = 227;
               break;
            case 235:
               var10000 = 186;
               break;
            case 236:
               var10000 = 194;
               break;
            case 237:
               var10000 = 210;
               break;
            case 238:
               var10000 = 139;
               break;
            case 239:
               var10000 = 61;
               break;
            case 240:
               var10000 = 7;
               break;
            case 241:
               var10000 = 254;
               break;
            case 242:
               var10000 = 126;
               break;
            case 243:
               var10000 = 130;
               break;
            case 244:
               var10000 = 199;
               break;
            case 245:
               var10000 = 214;
               break;
            case 246:
               var10000 = 72;
               break;
            case 247:
               var10000 = 98;
               break;
            case 248:
               var10000 = 154;
               break;
            case 249:
               var10000 = 105;
               break;
            case 250:
               var10000 = 220;
               break;
            case 251:
               var10000 = 202;
               break;
            case 252:
               var10000 = 146;
               break;
            case 253:
               var10000 = 236;
               break;
            case 254:
               var10000 = 52;
               break;
            default:
               var10000 = 79;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var23;
      String[] var7;
      var7 = new String[12];
      int var5 = 0;
      String var4 = "%;\u0084¯«y'ÜK?i \u0015Ñ\u0010\u001aÊxÕ]I\u001a\u008d\u008aú\u0080\u001fu8@\u0080\u0016\u0014\u001e\u0017àÄ<P¼\u0086Å#\u0017Åñ[\u0000\u008de7k T¶\u009d\u008bæ\f;\u008eG\u0019Ó¯(\u0006¿l^Ã\f\u0088}1g\u001d`ñÿ\u0084S9$\f>\u008dçyÇ£ª\u0087ýDRÝ\r\u0007ÞÀ\u0013#î6.ix2rô\u0015\u0003É@ñ3²4¥7\u0010/I4iãö\u0092YL/U\fF\nè\u0089&½\u0096Dz<¢Ò\fã®\\\u001d°/D\u0016'fä\u008b";
      int var6 = "%;\u0084¯«y'ÜK?i \u0015Ñ\u0010\u001aÊxÕ]I\u001a\u008d\u008aú\u0080\u001fu8@\u0080\u0016\u0014\u001e\u0017àÄ<P¼\u0086Å#\u0017Åñ[\u0000\u008de7k T¶\u009d\u008bæ\f;\u008eG\u0019Ó¯(\u0006¿l^Ã\f\u0088}1g\u001d`ñÿ\u0084S9$\f>\u008dçyÇ£ª\u0087ýDRÝ\r\u0007ÞÀ\u0013#î6.ix2rô\u0015\u0003É@ñ3²4¥7\u0010/I4iãö\u0092YL/U\fF\nè\u0089&½\u0096Dz<¢Ò\fã®\\\u001d°/D\u0016'fä\u008b"
         .length();
      char var3 = '\f';
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 118;
         String var10001 = var4.substring(++var10, var10 + var3);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var8 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var8) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  char var49 = var40[var10006];
                  byte var50;
                  switch (var8 % 7) {
                     case 0:
                        var50 = 124;
                        break;
                     case 1:
                        var50 = 38;
                        break;
                     case 2:
                        var50 = 110;
                        break;
                     case 3:
                        var50 = 31;
                        break;
                     case 4:
                        var50 = 23;
                        break;
                     case 5:
                        var50 = 64;
                        break;
                     default:
                        var50 = 47;
                  }

                  var40[var10006] = (char)(var49 ^ var36 ^ var50);
                  var8++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var8) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var8;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var7[var5++] = var33;
                  if ((var10 += var3) >= var6) {
                     a = var7;
                     d = new String[12];
                     long var0 = 4651539579831302326L;
                     long var27 = -622962026691184410L ^ var0;
                     byte var18 = -1;
                     e = var27;
                     return;
                  }

                  var3 = var4.charAt(var10);
                  break;
               default:
                  var7[var5++] = var33;
                  if ((var10 += var3) < var6) {
                     var3 = var4.charAt(var10);
                     continue label52;
                  }

                  var4 = "0K=º\u0087À¹ð\u0083¤xl*p;\u0093»/U\\¦Í\u009a\rÕ\u008d\u0081b\u0010ÛK\u0093ÝÔ¿ü^";
                  var6 = "0K=º\u0087À¹ð\u0083¤xl*p;\u0093»/U\\¦Í\u009a\rÕ\u008d\u0081b\u0010ÛK\u0093ÝÔ¿ü^".length();
                  var3 = 23;
                  var10 = -1;
            }

            var10000 = 110;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }
}





