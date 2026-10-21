package com.finalshell.core;

import com.finalshell.ui.listener.SM;
import com.finalshell.ui.model.DR3;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.XW;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;

public class XL extends Xv2 {
   public int j;
   public int Z;
   public int u;
   public boolean q;
   public com.finalshell.ui.model.Du2 W;
   public DR3 y;
   public int[][] o;
   public Shape s;
   public List S;
   public WC_2 r;
   public static String[] a;
   public static String[] b;
   public static long d;
   public static long e;

   public com.finalshell.ui.model.Du2 J() {
      return (com.finalshell.ui.model.Du2)this.C(b(-10948, -25030), com.finalshell.ui.model.Du2.random);
   }

   public void q(com.finalshell.ui.model.Du2 var1) {
      this.Y(b(-10955, -23368), var1);
   }

   public boolean S() {
      return (Boolean)this.C(b(-10957, -6288), Boolean.valueOf(true));
   }

   public void f(boolean var1) {
      this.Y(b(-10960, -9874), Boolean.valueOf(var1));
   }

   public int r() {
      return (Integer)this.C(b(-10945, 3570), Integer.valueOf((int)d));
   }

   public void x(int var1) {
      this.Y(b(-10947, 11137), Integer.valueOf(var1));
   }

   public int i() {
      return (Integer)this.C(b(-10958, 27772), Integer.valueOf(4));
   }

   public void t(int var1) {
      this.Y(b(-10954, -20540), Integer.valueOf(var1));
   }

   public int g() {
      return (Integer)this.C(b(-10959, -19390), Integer.valueOf(5));
   }

   public void p(int var1) {
      this.Y(b(-10956, -28012), Integer.valueOf(var1));
   }

   @Override
   public void X(XW var1) {
      boolean var2;
      int var14;
      label139: {
         int var10000 = (com.finalshell.ui.model.Du2.W()) ? 1 : 0;
         this.j = this.r();
         this.Z = this.i();
         this.u = this.g();
         this.q = this.S();
         var2 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
         this.y = NG.q(this.A());
         this.W = NG.R(this.J());
         int var3 = var1.getHeight();
         var10000 = var3 % this.j;
         if (!var2) {
            if (var10000 == 0) {
               var14 = var3;
               break label139;
            }

            var10000 = var3 / this.j * this.j;
         }

         var14 = var10000 + this.j;
      }

      int var9;
      label133: {
         var9 = var14;
         int var4 = var1.getWidth();
         var14 = var4 % this.j;
         if (!var2) {
            if (var14 == 0) {
               var14 = var4;
               break label133;
            }

            var14 = var4 / this.j * this.j;
         }

         var14 += this.j;
      }

      int var10 = var14;
      int var5 = var10 / this.j;
      int var6 = var9 / this.j;
      this.o = new int[var5][var6];
      int var7 = 0;

      label126: {
         label125: {
            label124: {
               label142: {
                  while (true) {
                     if (var7 < var5) {
                        var17 = false;
                        if (var2) {
                           break;
                        }

                        int var8 = 0;

                        label117: {
                           while (var8 < var6) {
                              this.o[var7][var8] = 0;
                              var8++;
                              if (var2) {
                                 break label117;
                              }

                              if (var2) {
                                 Ky4.K(new String[5]);
                                 break;
                              }
                           }

                           var7++;
                        }

                        if (!var2) {
                           continue;
                        }
                     }

                     var18 = this;
                     if (var2) {
                        break label142;
                     }

                     var17 = this.y.equals(DR3.right);
                     break;
                  }

                  if (!var17) {
                     var19 = this;
                     if (var2) {
                        break label125;
                     }

                     if (!this.y.equals(DR3.down)) {
                        break label124;
                     }
                  }

                  var18 = this;
               }

               var18.o[0][0] = this.Z;
               if (!var2) {
                  break label126;
               }
            }

            var19 = this;
         }

         var19.o[var5 - 1][var6 - 1] = this.Z;
      }

      byte var20 = (this.q) ? 1 : 0;
      if (!var2) {
         if (!this.q) {
            this.s = this.c(this.o);
         }

         var20 = (this.W.equals(com.finalshell.ui.model.Du2.randomize)) ? 1 : 0;
      }

      label150: {
         if (!var2) {
            if (var20 == 0) {
               break label150;
            }

            this.S = new ArrayList();
            var20 = 0;
         }

         var7 = var20;

         while (true) {
            if (var7 < var5) {
               if (var2) {
                  break;
               }

               int var12 = 0;

               label76: {
                  while (var12 < var6) {
                     this.S.add(new Point(var7, var12));
                     var12++;
                     if (var2) {
                        break label76;
                     }

                     if (var2) {
                        break;
                     }
                  }

                  var7++;
               }

               if (!var2) {
                  continue;
               }
            }

            if (var2) {
               break label150;
            }

            if (this.r != null) {
               this.r.Y();
            }

            this.r = new WC_2(b(-10953, 26241), e);
            this.r.q(new SM(this, var1));
            break;
         }

         this.r.u$WC();
      }

      var1.repaint();
   }

   @Override
   public boolean d(XW var1) {
      int var3 = 1;
      int var10000 = (com.finalshell.ui.model.Du2.W()) ? 1 : 0;
      int var4 = this.o.length;
      boolean var2 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
      int var5 = this.o[0].length;
      int var6 = 0;

      label111:
      while (true) {
         var10000 = var6;
         int var10001 = var4;

         label108:
         while (var10000 < var10001) {
            var10000 = 0;
            if (var2) {
               break label111;
            }

            int var7 = 0;

            while (var7 < var5) {
               label118: {
                  var10000 = this.o[var6][var7];
                  if (!var2) {
                     var10001 = this.j;
                     if (var2) {
                        continue label108;
                     }

                     if (var10000 >= this.j) {
                        break label118;
                     }

                     var10000 = this.o[var6][var7];
                  }

                  label95: {
                     label120: {
                        if (!var2) {
                           if (var10000 > 0) {
                              this.o[var6][var7] = this.o[var6][var7] + this.Z;
                              if (!var2) {
                                 break label120;
                              }
                           }

                           var10000 = (this.W.equals(com.finalshell.ui.model.Du2.cascade)) ? 1 : 0;
                        }

                        if (var2) {
                           break label95;
                        }

                        if (var10000 != 0) {
                           var10000 = (this.i(var6, var7, this.o)) ? 1 : 0;
                           if (var2) {
                              break label95;
                           }

                           if (var10000 != 0) {
                              this.o[var6][var7] = this.o[var6][var7] + this.Z;
                           }
                        }
                     }

                     var10000 = var3;
                  }

                  if (!var2) {
                     if (var10000 == 0) {
                        break label118;
                     }

                     var10000 = this.o[var6][var7];
                  }

                  if (!var2) {
                     if (var10000 >= this.j) {
                        break label118;
                     }

                     var10000 = 0;
                  }

                  var3 = var10000;
               }

               var7++;
               if (var2) {
                  break;
               }
            }

            var6++;
            if (!var2) {
               continue label111;
            }
            break;
         }

         var10000 = (this.q) ? 1 : 0;
         break;
      }

      if (!var2) {
         if (var10000 == 0) {
            this.s = this.c(this.o);
         }

         var10000 = var3;
      }

      if (!var2) {
         if (var10000 != 0) {
            this.s = null;
            if (!var2 && this.r != null) {
               this.r.Y();
            }

            return true;
         }

         var1.repaint();
         var10000 = 0;
      }

      return var10000 != 0;
   }

   public Shape c(int[][] var1) {
      boolean var10000 = com.finalshell.ui.model.Du2.R();
      GeneralPath var3 = new GeneralPath(0);
      boolean var2 = var10000;
      int var4 = 0;

      while (var4 < var1.length) {
         int var5 = 0;

         while (true) {
            if (var5 < var1[0].length) {
               var3.append(new Rectangle(var4 * this.j, var5 * this.j, var1[var4][var5], var1[var4][var5]), false);
               var5++;
               if (!var2) {
                  break;
               }

               if (var2) {
                  continue;
               }
            }

            var4++;
            break;
         }

         if (!var2) {
            break;
         }
      }

      return var3;
   }

   public boolean i(int var1, int var2, int[][] var3) {
      boolean var4;
      int var5;
      label344: {
         var4 = com.finalshell.ui.model.Du2.R();
         var5 = (this.y.equals(DR3.right)) ? 1 : 0;
         if (var4) {
            if (var5 == 0) {
               var5 = (this.y.equals(DR3.down)) ? 1 : 0;
               if (!var4) {
                  break label344;
               }

               if (var5 == 0) {
                  var5 = var1;
                  break label344;
               }
            }

            var5 = var1;
         }

         if (var4) {
            if (var5 > 0) {
               float var7;
               var5 = (var7 = (float)var3[var1 - 1][var2] - (float)this.j / 6.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
               if (!var4) {
                  return var5 != 0;
               }

               if (var5 > 0) {
                  return 1 != 0;
               }
            }

            var5 = var2;
         }

         if (var4) {
            if (var5 > 0) {
               float var8;
               var5 = (var8 = (float)var3[var1][var2 - 1] - (float)this.j / 6.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
               if (!var4) {
                  return var5 != 0;
               }

               if (var5 > 0) {
                  return 1 != 0;
               }
            }

            var5 = var1;
         }

         byte var10001 = 1;
         if (var4) {
            if (var5 > 1) {
               float var9;
               var5 = (var9 = (float)var3[var1 - 2][var2] - (float)this.j * 2.0F / 6.0F) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
               if (!var4) {
                  return var5 != 0;
               }

               if (var5 > 0) {
                  return 1 != 0;
               }
            }

            var5 = var2;
            var10001 = 1;
         }

         if (var4) {
            if (var5 > var10001) {
               float var10;
               var5 = (var10 = (float)var3[var1][var2 - 2] - (float)this.j * 2.0F / 6.0F) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
               if (!var4) {
                  return var5 != 0;
               }

               if (var5 > 0) {
                  return 1 != 0;
               }
            }

            var5 = var1;
            var10001 = 2;
         }

         if (var4) {
            if (var5 > var10001) {
               float var11;
               var5 = (var11 = (float)var3[var1 - 3][var2] - (float)this.j * 3.0F / 6.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
               if (!var4) {
                  return var5 != 0;
               }

               if (var5 > 0) {
                  return 1 != 0;
               }
            }

            var5 = var2;
            var10001 = 2;
         }

         if (var4) {
            if (var5 > var10001) {
               float var12;
               var5 = (var12 = (float)var3[var1][var2 - 3] - (float)this.j * 3.0F / 6.0F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
               if (!var4) {
                  return var5 != 0;
               }

               if (var5 > 0) {
                  return 1 != 0;
               }
            }

            var5 = var1;
            var10001 = 3;
         }

         if (var4) {
            if (var5 > var10001) {
               float var13;
               var5 = (var13 = (float)var3[var1 - 4][var2] - (float)this.j * 4.0F / 6.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
               if (!var4) {
                  return var5 != 0;
               }

               if (var5 > 0) {
                  return 1 != 0;
               }
            }

            var5 = var2;
            var10001 = 3;
         }

         if (var4) {
            if (var5 > var10001) {
               float var14;
               var5 = (var14 = (float)var3[var1][var2 - 4] - (float)this.j * 4.0F / 6.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
               if (!var4) {
                  return var5 != 0;
               }

               if (var5 > 0) {
                  return 1 != 0;
               }
            }

            var5 = var1;
            var10001 = 4;
         }

         label287: {
            if (var4) {
               if (var5 > var10001) {
                  float var15;
                  var5 = (var15 = (float)var3[var1 - 5][var2] - (float)this.j * 5.0F / 6.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
                  if (!var4) {
                     return var5 != 0;
                  }

                  if (var5 > 0) {
                     return 1 != 0;
                  }
               }

               var5 = var2;
               if (!var4) {
                  break label287;
               }

               var10001 = 4;
            }

            if (var5 <= var10001) {
               return 0 != 0;
            }

            float var16;
            var5 = (var16 = (float)var3[var1][var2 - 5] - (float)this.j * 5.0F / 6.0F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
         }

         if (!var4) {
            return var5 != 0;
         }

         if (var5 > 0) {
            return 1 != 0;
         }

         return 0 != 0;
      }

      int var6 = var3.length - 1;
      if (var4) {
         if (var5 < var6) {
            float var17;
            var5 = (var17 = (float)var3[var1 + 1][var2] - (float)this.j / 6.0F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
            if (!var4) {
               return var5 != 0;
            }

            if (var5 > 0) {
               return 1 != 0;
            }
         }

         var5 = var2;
         var6 = var3[0].length - 1;
      }

      if (var4) {
         if (var5 < var6) {
            float var18;
            var5 = (var18 = (float)var3[var1][var2 + 1] - (float)this.j / 6.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
            if (!var4) {
               return var5 != 0;
            }

            if (var5 > 0) {
               return 1 != 0;
            }
         }

         var5 = var1;
         var6 = var3.length - 2;
      }

      if (var4) {
         if (var5 < var6) {
            float var19;
            var5 = (var19 = (float)var3[var1 + 2][var2] - (float)this.j * 2.0F / 6.0F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
            if (!var4) {
               return var5 != 0;
            }

            if (var5 > 0) {
               return 1 != 0;
            }
         }

         var5 = var2;
         var6 = var3[0].length - 2;
      }

      if (var4) {
         if (var5 < var6) {
            float var20;
            var5 = (var20 = (float)var3[var1][var2 + 2] - (float)this.j * 2.0F / 6.0F) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
            if (!var4) {
               return var5 != 0;
            }

            if (var5 > 0) {
               return 1 != 0;
            }
         }

         var5 = var1;
         var6 = var3.length - 3;
      }

      if (var4) {
         if (var5 < var6) {
            float var21;
            var5 = (var21 = (float)var3[var1 + 3][var2] - (float)this.j * 3.0F / 6.0F) == 0.0F ? 0 : (var21 < 0.0F ? -1 : 1);
            if (!var4) {
               return var5 != 0;
            }

            if (var5 > 0) {
               return 1 != 0;
            }
         }

         var5 = var2;
         var6 = var3[0].length - 3;
      }

      if (var4) {
         if (var5 < var6) {
            float var22;
            var5 = (var22 = (float)var3[var1][var2 + 3] - (float)this.j * 3.0F / 6.0F) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
            if (!var4) {
               return var5 != 0;
            }

            if (var5 > 0) {
               return 1 != 0;
            }
         }

         var5 = var1;
         var6 = var3.length - 4;
      }

      if (var4) {
         if (var5 < var6) {
            float var23;
            var5 = (var23 = (float)var3[var1 + 4][var2] - (float)this.j * 4.0F / 6.0F) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
            if (!var4) {
               return var5 != 0;
            }

            if (var5 > 0) {
               return 1 != 0;
            }
         }

         var5 = var2;
         var6 = var3[0].length - 4;
      }

      if (var4) {
         if (var5 < var6) {
            float var24;
            var5 = (var24 = (float)var3[var1][var2 + 4] - (float)this.j * 4.0F / 6.0F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
            if (!var4) {
               return var5 != 0;
            }

            if (var5 > 0) {
               return 1 != 0;
            }
         }

         var5 = var1;
         var6 = var3.length - 5;
      }

      label291: {
         if (var4) {
            if (var5 < var6) {
               float var25;
               var5 = (var25 = (float)var3[var1 + 5][var2] - (float)this.j * 5.0F / 6.0F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
               if (!var4) {
                  return var5 != 0;
               }

               if (var5 > 0) {
                  return 1 != 0;
               }
            }

            var5 = var2;
            if (!var4) {
               break label291;
            }

            var6 = var3[0].length - 5;
         }

         if (var5 >= var6) {
            return 0 != 0;
         }

         float var26;
         var5 = (var26 = (float)var3[var1][var2 + 5] - (float)this.j * 5.0F / 6.0F) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
      }

      if (!var4) {
         return var5 != 0;
      } else {
         return (boolean)(var5 > 0 ? 1 : 0);
      }
   }

   @Override
   public void D(Graphics2D var1, XW var2) {
      boolean var3;
      label80: {
         int var10000 = (com.finalshell.ui.model.Du2.R()) ? 1 : 0;
         int var4 = var2.getWidth();
         var3 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
         int var5 = var2.getHeight();
         Graphics2D var19 = var1;
         if (var3) {
            var1.drawImage(var2.R$BufferedImage(), 0, 0, var4, var5, null);
            if (this.q) {
               int var6 = this.o.length;
               int var7 = this.o[0].length;
               int var8 = 0;

               label75:
               while (true) {
                  var10000 = var8;

                  label73:
                  while (true) {
                     if (var10000 >= var6) {
                        break label75;
                     }

                     if (!var3) {
                        break label80;
                     }

                     int var9 = 0;

                     while (var9 < var7) {
                        int var10 = this.o[var8][var9];
                        if (var3) {
                           var10000 = var10;
                           if (!var3) {
                              continue label73;
                           }

                           if (var10 > 0) {
                              int var11 = var8 * this.j;
                              int var12 = var9 * this.j;
                              int var13 = Math.min(var4 - var11, this.j);
                              int var14 = Math.min(var5 - var12, this.j);
                              int var15 = var11 + var13;
                              int var16 = var12 + var14;
                              Float var10001 = (float)var10 / (float)this.j;
                              int var10002 = var10;
                              if (var3) {
                                 var10002 = var10 < this.j ? 1 : 0;
                              }

                              Composite var17 = RV.a(var1, var10001, (boolean)var10002);
                              var1.drawImage(var2.y(), var11, var12, var15, var16, var11, var12, var15, var16, null);
                              var10002 = var10;
                              if (var3) {
                                 var10002 = var10 < this.j ? 1 : 0;
                              }

                              RV.E(var1, var17, (boolean)var10002);
                           }

                           var9++;
                        }

                        if (!var3) {
                           break;
                        }
                     }

                     var8++;
                     if (!var3) {
                        break label75;
                     }
                     break;
                  }
               }

               if (var3) {
                  break label80;
               }
            }

            var19 = var1;
         }

         Shape var18 = RV.n(var19, this.s);
         var1.drawImage(var2.y(), 0, 0, var4, var5, null);
         RV.w(var1, var18);
      }

      if (Ky4.F$arrString() != null) {
         com.finalshell.ui.model.Du2.r(!var3);
      }
   }

   static int I(XL var0) {
      return var0.u;
   }

   static List X(XL var0) {
      return var0.S;
   }

   static int[][] Q(XL var0) {
      return var0.o;
   }

   static int K(XL var0) {
      return var0.Z;
   }

   static WC_2 h(XL var0) {
      return var0.r;
   }

   static {
      __vfClinit__();
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -10955) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 26;
               break;
            case 1:
               var10000 = 217;
               break;
            case 2:
               var10000 = 13;
               break;
            case 3:
               var10000 = 130;
               break;
            case 4:
               var10000 = 118;
               break;
            case 5:
               var10000 = 111;
               break;
            case 6:
               var10000 = 108;
               break;
            case 7:
               var10000 = 110;
               break;
            case 8:
               var10000 = 9;
               break;
            case 9:
               var10000 = 241;
               break;
            case 10:
               var10000 = 158;
               break;
            case 11:
               var10000 = 88;
               break;
            case 12:
               var10000 = 155;
               break;
            case 13:
               var10000 = 148;
               break;
            case 14:
               var10000 = 31;
               break;
            case 15:
               var10000 = 52;
               break;
            case 16:
               var10000 = 209;
               break;
            case 17:
               var10000 = 247;
               break;
            case 18:
               var10000 = 151;
               break;
            case 19:
               var10000 = 183;
               break;
            case 20:
               var10000 = 228;
               break;
            case 21:
               var10000 = 75;
               break;
            case 22:
               var10000 = 227;
               break;
            case 23:
               var10000 = 48;
               break;
            case 24:
               var10000 = 223;
               break;
            case 25:
               var10000 = 225;
               break;
            case 26:
               var10000 = 67;
               break;
            case 27:
               var10000 = 212;
               break;
            case 28:
               var10000 = 126;
               break;
            case 29:
               var10000 = 159;
               break;
            case 30:
               var10000 = 25;
               break;
            case 31:
               var10000 = 74;
               break;
            case 32:
               var10000 = 147;
               break;
            case 33:
               var10000 = 8;
               break;
            case 34:
               var10000 = 143;
               break;
            case 35:
               var10000 = 156;
               break;
            case 36:
               var10000 = 99;
               break;
            case 37:
               var10000 = 243;
               break;
            case 38:
               var10000 = 124;
               break;
            case 39:
               var10000 = 127;
               break;
            case 40:
               var10000 = 15;
               break;
            case 41:
               var10000 = 106;
               break;
            case 42:
               var10000 = 76;
               break;
            case 43:
               var10000 = 142;
               break;
            case 44:
               var10000 = 236;
               break;
            case 45:
               var10000 = 55;
               break;
            case 46:
               var10000 = 215;
               break;
            case 47:
               var10000 = 204;
               break;
            case 48:
               var10000 = 115;
               break;
            case 49:
               var10000 = 194;
               break;
            case 50:
               var10000 = 232;
               break;
            case 51:
               var10000 = 41;
               break;
            case 52:
               var10000 = 146;
               break;
            case 53:
               var10000 = 199;
               break;
            case 54:
               var10000 = 73;
               break;
            case 55:
               var10000 = 40;
               break;
            case 56:
               var10000 = 244;
               break;
            case 57:
               var10000 = 245;
               break;
            case 58:
               var10000 = 60;
               break;
            case 59:
               var10000 = 85;
               break;
            case 60:
               var10000 = 179;
               break;
            case 61:
               var10000 = 116;
               break;
            case 62:
               var10000 = 95;
               break;
            case 63:
               var10000 = 37;
               break;
            case 64:
               var10000 = 14;
               break;
            case 65:
               var10000 = 97;
               break;
            case 66:
               var10000 = 164;
               break;
            case 67:
               var10000 = 18;
               break;
            case 68:
               var10000 = 17;
               break;
            case 69:
               var10000 = 54;
               break;
            case 70:
               var10000 = 68;
               break;
            case 71:
               var10000 = 51;
               break;
            case 72:
               var10000 = 145;
               break;
            case 73:
               var10000 = 120;
               break;
            case 74:
               var10000 = 181;
               break;
            case 75:
               var10000 = 203;
               break;
            case 76:
               var10000 = 218;
               break;
            case 77:
               var10000 = 224;
               break;
            case 78:
               var10000 = 28;
               break;
            case 79:
               var10000 = 250;
               break;
            case 80:
               var10000 = 24;
               break;
            case 81:
               var10000 = 90;
               break;
            case 82:
               var10000 = 200;
               break;
            case 83:
               var10000 = 57;
               break;
            case 84:
               var10000 = 62;
               break;
            case 85:
               var10000 = 29;
               break;
            case 86:
               var10000 = 44;
               break;
            case 87:
               var10000 = 94;
               break;
            case 88:
               var10000 = 0;
               break;
            case 89:
               var10000 = 86;
               break;
            case 90:
               var10000 = 131;
               break;
            case 91:
               var10000 = 157;
               break;
            case 92:
               var10000 = 178;
               break;
            case 93:
               var10000 = 89;
               break;
            case 94:
               var10000 = 193;
               break;
            case 95:
               var10000 = 167;
               break;
            case 96:
               var10000 = 254;
               break;
            case 97:
               var10000 = 82;
               break;
            case 98:
               var10000 = 63;
               break;
            case 99:
               var10000 = 195;
               break;
            case 100:
               var10000 = 134;
               break;
            case 101:
               var10000 = 66;
               break;
            case 102:
               var10000 = 49;
               break;
            case 103:
               var10000 = 33;
               break;
            case 104:
               var10000 = 172;
               break;
            case 105:
               var10000 = 27;
               break;
            case 106:
               var10000 = 22;
               break;
            case 107:
               var10000 = 166;
               break;
            case 108:
               var10000 = 230;
               break;
            case 109:
               var10000 = 221;
               break;
            case 110:
               var10000 = 136;
               break;
            case 111:
               var10000 = 2;
               break;
            case 112:
               var10000 = 12;
               break;
            case 113:
               var10000 = 98;
               break;
            case 114:
               var10000 = 201;
               break;
            case 115:
               var10000 = 176;
               break;
            case 116:
               var10000 = 173;
               break;
            case 117:
               var10000 = 160;
               break;
            case 118:
               var10000 = 135;
               break;
            case 119:
               var10000 = 161;
               break;
            case 120:
               var10000 = 39;
               break;
            case 121:
               var10000 = 32;
               break;
            case 122:
               var10000 = 50;
               break;
            case 123:
               var10000 = 100;
               break;
            case 124:
               var10000 = 47;
               break;
            case 125:
               var10000 = 101;
               break;
            case 126:
               var10000 = 149;
               break;
            case 127:
               var10000 = 6;
               break;
            case 128:
               var10000 = 175;
               break;
            case 129:
               var10000 = 59;
               break;
            case 130:
               var10000 = 144;
               break;
            case 131:
               var10000 = 154;
               break;
            case 132:
               var10000 = 206;
               break;
            case 133:
               var10000 = 246;
               break;
            case 134:
               var10000 = 214;
               break;
            case 135:
               var10000 = 43;
               break;
            case 136:
               var10000 = 213;
               break;
            case 137:
               var10000 = 242;
               break;
            case 138:
               var10000 = 77;
               break;
            case 139:
               var10000 = 184;
               break;
            case 140:
               var10000 = 139;
               break;
            case 141:
               var10000 = 78;
               break;
            case 142:
               var10000 = 107;
               break;
            case 143:
               var10000 = 104;
               break;
            case 144:
               var10000 = 129;
               break;
            case 145:
               var10000 = 46;
               break;
            case 146:
               var10000 = 187;
               break;
            case 147:
               var10000 = 96;
               break;
            case 148:
               var10000 = 71;
               break;
            case 149:
               var10000 = 211;
               break;
            case 150:
               var10000 = 162;
               break;
            case 151:
               var10000 = 87;
               break;
            case 152:
               var10000 = 141;
               break;
            case 153:
               var10000 = 252;
               break;
            case 154:
               var10000 = 171;
               break;
            case 155:
               var10000 = 103;
               break;
            case 156:
               var10000 = 165;
               break;
            case 157:
               var10000 = 240;
               break;
            case 158:
               var10000 = 153;
               break;
            case 159:
               var10000 = 72;
               break;
            case 160:
               var10000 = 177;
               break;
            case 161:
               var10000 = 220;
               break;
            case 162:
               var10000 = 138;
               break;
            case 163:
               var10000 = 38;
               break;
            case 164:
               var10000 = 7;
               break;
            case 165:
               var10000 = 102;
               break;
            case 166:
               var10000 = 182;
               break;
            case 167:
               var10000 = 30;
               break;
            case 168:
               var10000 = 81;
               break;
            case 169:
               var10000 = 255;
               break;
            case 170:
               var10000 = 137;
               break;
            case 171:
               var10000 = 251;
               break;
            case 172:
               var10000 = 207;
               break;
            case 173:
               var10000 = 56;
               break;
            case 174:
               var10000 = 79;
               break;
            case 175:
               var10000 = 133;
               break;
            case 176:
               var10000 = 93;
               break;
            case 177:
               var10000 = 169;
               break;
            case 178:
               var10000 = 248;
               break;
            case 179:
               var10000 = 219;
               break;
            case 180:
               var10000 = 61;
               break;
            case 181:
               var10000 = 233;
               break;
            case 182:
               var10000 = 229;
               break;
            case 183:
               var10000 = 188;
               break;
            case 184:
               var10000 = 117;
               break;
            case 185:
               var10000 = 205;
               break;
            case 186:
               var10000 = 238;
               break;
            case 187:
               var10000 = 19;
               break;
            case 188:
               var10000 = 226;
               break;
            case 189:
               var10000 = 125;
               break;
            case 190:
               var10000 = 174;
               break;
            case 191:
               var10000 = 80;
               break;
            case 192:
               var10000 = 150;
               break;
            case 193:
               var10000 = 65;
               break;
            case 194:
               var10000 = 122;
               break;
            case 195:
               var10000 = 216;
               break;
            case 196:
               var10000 = 53;
               break;
            case 197:
               var10000 = 237;
               break;
            case 198:
               var10000 = 239;
               break;
            case 199:
               var10000 = 189;
               break;
            case 200:
               var10000 = 180;
               break;
            case 201:
               var10000 = 190;
               break;
            case 202:
               var10000 = 198;
               break;
            case 203:
               var10000 = 23;
               break;
            case 204:
               var10000 = 185;
               break;
            case 205:
               var10000 = 186;
               break;
            case 206:
               var10000 = 249;
               break;
            case 207:
               var10000 = 132;
               break;
            case 208:
               var10000 = 197;
               break;
            case 209:
               var10000 = 16;
               break;
            case 210:
               var10000 = 3;
               break;
            case 211:
               var10000 = 109;
               break;
            case 212:
               var10000 = 168;
               break;
            case 213:
               var10000 = 91;
               break;
            case 214:
               var10000 = 123;
               break;
            case 215:
               var10000 = 4;
               break;
            case 216:
               var10000 = 163;
               break;
            case 217:
               var10000 = 208;
               break;
            case 218:
               var10000 = 234;
               break;
            case 219:
               var10000 = 140;
               break;
            case 220:
               var10000 = 35;
               break;
            case 221:
               var10000 = 112;
               break;
            case 222:
               var10000 = 21;
               break;
            case 223:
               var10000 = 170;
               break;
            case 224:
               var10000 = 69;
               break;
            case 225:
               var10000 = 222;
               break;
            case 226:
               var10000 = 10;
               break;
            case 227:
               var10000 = 92;
               break;
            case 228:
               var10000 = 196;
               break;
            case 229:
               var10000 = 58;
               break;
            case 230:
               var10000 = 20;
               break;
            case 231:
               var10000 = 45;
               break;
            case 232:
               var10000 = 11;
               break;
            case 233:
               var10000 = 70;
               break;
            case 234:
               var10000 = 1;
               break;
            case 235:
               var10000 = 105;
               break;
            case 236:
               var10000 = 83;
               break;
            case 237:
               var10000 = 191;
               break;
            case 238:
               var10000 = 231;
               break;
            case 239:
               var10000 = 5;
               break;
            case 240:
               var10000 = 192;
               break;
            case 241:
               var10000 = 64;
               break;
            case 242:
               var10000 = 253;
               break;
            case 243:
               var10000 = 114;
               break;
            case 244:
               var10000 = 119;
               break;
            case 245:
               var10000 = 128;
               break;
            case 246:
               var10000 = 36;
               break;
            case 247:
               var10000 = 152;
               break;
            case 248:
               var10000 = 84;
               break;
            case 249:
               var10000 = 34;
               break;
            case 250:
               var10000 = 235;
               break;
            case 251:
               var10000 = 202;
               break;
            case 252:
               var10000 = 42;
               break;
            case 253:
               var10000 = 121;
               break;
            case 254:
               var10000 = 210;
               break;
            default:
               var10000 = 113;
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
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "ÇíÁ\u0004Ãä\u008b6\n\u008d\f¥¹\u008d\u008eJµ¯\b&Ì\u0013$!.oÜPdf[ä!²%\u008aÝùià\u0096æO\u0003¥\u009a`§¹°\u000e_\u0003õ¦ \u0085\u000bà\u0013%Û_\u001f\u001f@jkÛ\fæ\u008aåèGy\u000e\u0091\u0012ÿ\u0095B\n\u0019\u0098\u001aª¸1ö\u0094áÂ\n\u0018\u008f:H¼mv\u001fñ³\u000b\u009c\u0092ªë®\u0019!\u0080\u00ads#\nª\u000elxvk:×Ñ£";
      int var8 = "ÇíÁ\u0004Ãä\u008b6\n\u008d\f¥¹\u008d\u008eJµ¯\b&Ì\u0013$!.oÜPdf[ä!²%\u008aÝùià\u0096æO\u0003¥\u009a`§¹°\u000e_\u0003õ¦ \u0085\u000bà\u0013%Û_\u001f\u001f@jkÛ\fæ\u008aåèGy\u000e\u0091\u0012ÿ\u0095B\n\u0019\u0098\u001aª¸1ö\u0094áÂ\n\u0018\u008f:H¼mv\u001fñ³\u000b\u009c\u0092ªë®\u0019!\u0080\u00ads#\nª\u000elxvk:×Ñ£"
         .length();
      char var5 = '\n';
      int var12 = -1;

      label52:
      while (true) {
         byte var10000 = 91;
         String var10001 = var6.substring(++var12, var12 + var5);
         byte var10002 = -1;

         while (true) {
      char[] var26;
            label47: {
               char[] var32 = var10001.toCharArray();
               int var10004 = var32.length;
               int var10 = 0;
               byte var35 = var10000;
               var26 = var32;
               int var18 = var10004;
               byte var40;
               char[] var44;
               int var10006;
               if (var10004 <= 1) {
                  var44 = var32;
                  var40 = var10000;
                  var10006 = var10;
               } else {
                  var35 = var10000;
                  var18 = var10004;
                  if (var10004 <= var10) {
                     break label47;
                  }

                  var44 = var32;
                  var40 = var10000;
                  var10006 = var10;
               }

               while (true) {
                  char var53 = var44[var10006];
                  byte var54;
                  switch (var10 % 7) {
                     case 0:
                        var54 = 122;
                        break;
                     case 1:
                        var54 = 106;
                        break;
                     case 2:
                        var54 = 3;
                        break;
                     case 3:
                        var54 = 66;
                        break;
                     case 4:
                        var54 = 70;
                        break;
                     case 5:
                        var54 = 104;
                        break;
                     default:
                        var54 = 125;
                  }

                  var44[var10006] = (char)(var53 ^ var40 ^ var54);
                  var10++;
                  if (var35 == 0) {
                     var10006 = var35;
                     var44 = var26;
                     var40 = var35;
                  } else {
                     if (var18 <= var10) {
                        break;
                     }

                     var44 = var26;
                     var40 = var35;
                     var10006 = var10;
                  }
               }
            }

            String var37 = new String(var26).intern();
            switch (var10002) {
               case 0:
                  var9[var7++] = var37;
                  if ((var12 += var5) >= var8) {
                     a = var9;
                     b = new String[11];
                     long var2 = 8546080635854638950L;
                     long var30 = -1417038610804912330L ^ var2;
                     byte var20 = -1;
                     d = var30;
                     long var0 = 2605110500896105986L;
                     long var31 = 2605110500896106032L ^ var0;
                     byte var21 = -1;
                     e = var31;
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var37;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label52;
                  }

                  var6 = "?Í\u0095K\u0002Fø)/%\nþÅ\u00adJ\u0005f\u001f=>µ";
                  var8 = "?Í\u0095K\u0002Fø)/%\nþÅ\u00adJ\u0005f\u001f=>µ".length();
                  var5 = '\n';
                  var12 = -1;
            }

            var10000 = 81;
            var10001 = var6.substring(++var12, var12 + var5);
            var10002 = 0;
         }
      }
   }
}





