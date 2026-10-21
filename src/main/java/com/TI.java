package com;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.util.List;

public class TI extends com.T4 {
   final com.oY_3 r;
   private static final long[] a;
   private static final Integer[] b;

   protected TI(com.oY_3 var1) {
      this.r = var1;
   }

   @Override
   public void layoutContainer(Container var1) {
      int var10000 = com.oY_3.Z();
      byte var3 = this.r.getComponentOrientation().isLeftToRight();
      int var4 = 0;
      boolean var2 = (boolean)var10000;

      while (var4 < this.r.y.size()) {
         Component var5 = this.r.J(var4).j();
         if (!var2) {
            label45:
            if (var5 != null) {
               Point var6 = this.r.S(var4);
               Dimension var7 = var5.getPreferredSize();
               var10000 = this.r.v;
               if (!var2) {
                  if (this.r.v == 0) {
                     label86: {
                        int var8;
                        int var20;
                        label85: {
                           label84: {
                              var8 = var6.x - var7.width / 2;
                              var10000 = this.r.b;
                              var20 = 1;
                              if (!var2) {
                                 if (this.r.b != 1) {
                                    var10000 = this.r.b;
                                    var20 = b(28836, 8533925339857010955L);
                                    if (var2) {
                                       break label85;
                                    }

                                    if (var10000 != var20) {
                                       break label84;
                                    }
                                 }

                                 var10000 = var6.y - this.r.g / 2 - this.r.q - this.r.s;
                                 var20 = var7.height;
                              }

                              int var9 = var10000 - var20;
                              var5.setBounds(var8, var9, var7.width, var7.height);
                              if (!var2) {
                                 break label86;
                              }
                           }

                           var10000 = var6.y + this.r.g / 2 + this.r.q;
                           var20 = this.r.s;
                        }

                        int var11 = var10000 + var20;
                        var5.setBounds(var8, var11, var7.width, var7.height);
                     }

                     if (!var2) {
                        break label45;
                     }
                  }

                  var10000 = var6.y - var7.height / 2;
               }

               int var10;
               label70: {
                  int var22;
                  label69: {
                     label68: {
                        var10 = var10000;
                        var10000 = this.r.b;
                        var22 = 2;
                        label67:
                        if (!var2) {
                           label65:
                           if (this.r.b != 2) {
                              var10000 = var3;
                              if (!var2) {
                                 if (var3 != 0) {
                                    var10000 = this.r.b;
                                    var22 = b(31330, 7488762487545121743L);
                                    if (var2) {
                                       break label67;
                                    }

                                    if (var10000 == var22) {
                                       break label65;
                                    }
                                 }

                                 var10000 = var3;
                              }

                              if (var2) {
                                 break label70;
                              }

                              if (var10000 != 0) {
                                 break label68;
                              }

                              var10000 = this.r.b;
                              var22 = b(25627, 2408699329735185847L);
                              if (var2) {
                                 break label69;
                              }

                              if (var10000 != var22) {
                                 break label68;
                              }
                           }

                           var10000 = var6.x - this.r.g / 2 - this.r.q - this.r.s;
                           var22 = var7.width;
                        }

                        int var12 = var10000 - var22;
                        var5.setBounds(var12, var10, var7.width, var7.height);
                        if (!var2) {
                           break label45;
                        }
                     }

                     var10000 = var6.x + this.r.g / 2 + this.r.q;
                     var22 = this.r.s;
                  }

                  var10000 += var22;
               }

               int var13 = var10000;
               var5.setBounds(var13, var10, var7.width, var7.height);
            }

            var4++;
         }

         if (var2) {
            break;
         }
      }
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      int var10000 = com.oY_3.Z();
      Dimension var3 = this.L();
      Dimension var4 = this.K();
      int var5 = this.r.y.size() - 1;
      boolean var2 = (boolean)var10000;
      var10000 = this.r.v;
      if (!var2) {
         if (this.r.v == 0) {
            this.r.Q = Math.max(var4.width / 2, this.r.g / 2 + this.r.q);
            int var7 = 0;
            int var8 = 0;

            while (true) {
               if (var8 < var5) {
                  Component var9 = ((u_)this.r.y.get(var8)).j();
                  if (var2) {
                     break;
                  }

                  label99: {
                     Component var22 = var9;
                     if (!var2) {
                        if (var9 == null) {
                           var23 = new Dimension(0, 0);
                           break label99;
                        }

                        var22 = var9;
                     }

                     var23 = var22.getPreferredSize();
                  }

                  Dimension var10;
                  label93: {
                     var10 = var23;
                     Component var11 = ((u_)this.r.y.get(var8 + 1)).j();
                     Component var24 = var11;
                     if (!var2) {
                        if (var11 == null) {
                           var25 = new Dimension(0, 0);
                           break label93;
                        }

                        var24 = var11;
                     }

                     var25 = var24.getPreferredSize();
                  }

                  Dimension var12 = var25;
                  var7 = Math.max(var7, var10.width / 2 + var12.width / 2);
                  var8++;
                  if (!var2) {
                     continue;
                  }

                  com.ky_4.K(new String[4]);
               }

               var8 = (Math.max(this.r.q * 2 + this.r.g, var7) + this.r.T) * var5;
               break;
            }

            var10000 = this.r.q * 2 + this.r.g + var3.height;
            int var10001 = var3.height;
            if (!var2) {
               var10001 = var3.height > 0 ? this.r.s : 0;
            }

            int var15 = var10000 + var10001;
            Dimension var6 = new Dimension(this.r.k.left + var8 + this.r.Q * 2 + this.r.k.right + 1, this.r.k.top + var15 + this.r.k.bottom + 1);
            if (!var2) {
               return var6;
            }
         }

         this.r.Q = Math.max(var4.height / 2, this.r.g / 2 + this.r.q);
         var10000 = 0;
      }

      int var13 = var10000;
      int var14 = 0;

      label76: {
         while (var14 < var5) {
            Component var16 = ((u_)this.r.y.get(var14)).j();
            if (var2) {
               break label76;
            }

            label72: {
               Component var27 = var16;
               if (!var2) {
                  if (var16 == null) {
                     var28 = new Dimension(0, 0);
                     break label72;
                  }

                  var27 = var16;
               }

               var28 = var27.getPreferredSize();
            }

            Dimension var18;
            label66: {
               var18 = var28;
               Component var19 = ((u_)this.r.y.get(var14 + 1)).j();
               Component var29 = var19;
               if (!var2) {
                  if (var19 == null) {
                     var30 = new Dimension(0, 0);
                     break label66;
                  }

                  var29 = var19;
               }

               var30 = var29.getPreferredSize();
            }

            Dimension var20 = var30;
            var13 = Math.max(var13, var18.height / 2 + var20.height / 2);
            var14++;
            if (var2) {
               break;
            }
         }

         var14 = (Math.max(this.r.q * 2 + this.r.g, var13) + var5) * var5;
      }

      var10000 = this.r.q * 2 + this.r.g + var3.width;
      int var32 = var3.width;
      if (!var2) {
         var32 = var3.width > 0 ? this.r.s : 0;
      }

      int var17 = var10000 + var32;
      return new Dimension(this.r.k.left + var17 + this.r.k.right + 1, this.r.k.top + var14 + this.r.Q * 2 + this.r.k.bottom + 1);
   }

   public Dimension L() {
      boolean var1;
      Dimension var2;
      List var6;
      label37: {
         boolean var10000 = com.oY_3.y();
         var2 = new Dimension(0, 0);
         var1 = var10000;
         int var5 = this.r.M;
         if (var1) {
            if (!this.r.M) {
               return var2;
            }

            var6 = this.r.y;
            if (!var1) {
               break label37;
            }

            var5 = this.r.y.size();
         }

         if (var5 <= 0) {
            return var2;
         }

         var6 = this.r.y;
      }

      for (u_ var4 : var6) {
         if (var4.j() != null) {
            var2 = com.FN.h(var2, var4.j().getPreferredSize());
         }

         if (!var1) {
            break;
         }
      }

      return var2;
   }

   public Dimension K() {
      boolean var1;
      Object var4;
      label55: {
         var1 = com.oY_3.y();
         int var10000 = this.r.M;
         if (var1) {
            if (!this.r.M) {
               return new Dimension(0, 0);
            }

            var4 = this.r.y;
            if (!var1) {
               break label55;
            }

            var10000 = this.r.y.size();
         }

         if (var10000 <= 0) {
            return new Dimension(0, 0);
         }

         var4 = this.r.y.get(0);
      }

      Component var2;
      Component var3;
      var2 = ((u_)var4).j();
      var3 = ((u_)this.r.y.get(this.r.y.size() - 1)).j();
      var4 = var2;
      label40:
      if (var1) {
         if (var2 != null) {
            var4 = var3;
            if (!var1) {
               break label40;
            }

            if (var3 != null) {
               return com.FN.h(var2.getPreferredSize(), var3.getPreferredSize());
            }
         }

         var4 = var2;
      }

      if (var1) {
         if (var4 != null) {
            return var2.getPreferredSize();
         }

         var4 = var3;
      }

      if (var1) {
         if (var4 == null) {
            return new Dimension(0, 0);
         }

         var4 = var3;
      }

      return var4.getPreferredSize();
   }

   static {
      long var0 = 5837101667618556336L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "qù÷\u0015}[BuÕ\u0085¡\u008b\u0017¨Ü\fM;\u0080\u0002\u009dßH±";
      int var5 = "qù÷\u0015}[BuÕ\u0085¡\u008b\u0017¨Ü\fM;\u0080\u0002\u009dßH±".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[3];
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12717;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





