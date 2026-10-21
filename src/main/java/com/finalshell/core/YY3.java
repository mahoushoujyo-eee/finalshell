package com.finalshell.core;

import java.awt.Rectangle;

public class YY3 extends GT3 {
   public float x = 1.0F;
   public Po2 r;
   public boolean g = true;
   public boolean j = false;
   public boolean f = false;
   public int B;
   public static int N;
   public static int t;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public YY3() {
      this.r = new WY3();
   }

   public void e(float var1) {
      this.x = var1;
   }

   public float N() {
      return this.x;
   }

   public void C(Po2 var1) {
      this.r = var1;
   }

   public Po2 I() {
      return this.r;
   }

   public void a(boolean var1) {
      this.g = var1;
   }

   public boolean D() {
      return this.g;
   }

   public void Q(int var1) {
      this.B = var1;
   }

   public int n() {
      return this.B;
   }

   public void S(boolean var1) {
      this.j = var1;
   }

   public boolean R() {
      return this.j;
   }

   public void X(boolean var1) {
      this.f = var1;
   }

   public boolean Z() {
      return this.f;
   }

   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      int[] var5 = new int[var1 * var2];
      this.O(var3, var5, var1, var2);
      int var6 = this.d(var5, var1, var2);
      this.u(var5, var3, var1, var2, var6);
      return var3;
   }

   public int d(int[] var1, int var2, int var3) {
      int var11;
      int var17;
      int var18;
      int var19;
      int var23;
      int var24;
      int var5 = var2 - 3;
      String[] var10000 = W5.q();
      int var6 = var3 - 3;
      int var7 = 0;
      int var9 = 0;
      String[] var4 = var10000;

      label166:
      while (true) {
         int var16 = var9;

         label163:
         while (var16 < var3) {
            var17 = 0;
            if (var4 == null) {
               break label166;
            }

            int var10 = 0;

            while (var10 < var2) {
               var11 = var10 + var9 * var2;
               if (var4 != null) {
                  var16 = var1[var11];
                  if (var4 == null) {
                     continue label163;
                  }

                  label132:
                  if (var16 > 0) {
                     int var8;
                     label152: {
                        label151: {
                           label150: {
                              var18 = var10;
                              label149:
                              if (var4 != null) {
                                 if (var10 >= 2) {
                                    var18 = var10;
                                    if (var4 == null) {
                                       break label149;
                                    }

                                    if (var10 <= var5) {
                                       var18 = var9;
                                       if (var4 == null) {
                                          break label149;
                                       }

                                       if (var9 >= 2) {
                                          var19 = var9;
                                          if (var4 == null) {
                                             break label151;
                                          }

                                          if (var9 <= var6) {
                                             break label150;
                                          }
                                       }
                                    }
                                 }

                                 var18 = this.F(var10, var9, var1, var2, var11, var5, var6);
                              }

                              var8 = var18;
                              if (var4 != null) {
                                 break label152;
                              }
                           }

                           var19 = this.z(var1, var2, var11);
                        }

                        var8 = var19;
                     }

                     int var20 = var8;
                     if (var4 != null) {
                        if (var8 <= var7) {
                           break label132;
                        }

                        var20 = var8;
                     }

                     var7 = var20;
                  }

                  var10++;
               }

               if (var4 == null) {
                  break;
               }
            }

            var9++;
            if (var4 != null) {
               continue label166;
            }
            break;
         }

         var17 = var3 - 1;
         break;
      }

      var9 = var17;

      label113:
      while (true) {
         int var21 = var9;

         label110:
         while (var21 >= 0) {
            int var22 = var2 - 1;
            if (var4 == null) {
               return var22;
            }

            int var14 = var22;

            while (var14 >= 0) {
               int var15 = var14 + var9 * var2;
               if (var4 != null) {
                  var21 = var1[var15];
                  if (var4 == null) {
                     continue label110;
                  }

                  label79:
                  if (var21 > 0) {
                     int var12;
                     label99: {
                        label98: {
                           label97: {
                              var23 = var14;
                              label96:
                              if (var4 != null) {
                                 if (var14 >= 2) {
                                    var23 = var14;
                                    if (var4 == null) {
                                       break label96;
                                    }

                                    if (var14 <= var5) {
                                       var23 = var9;
                                       if (var4 == null) {
                                          break label96;
                                       }

                                       if (var9 >= 2) {
                                          var24 = var9;
                                          if (var4 == null) {
                                             break label98;
                                          }

                                          if (var9 <= var6) {
                                             break label97;
                                          }
                                       }
                                    }
                                 }

                                 var23 = this.F(var14, var9, var1, var2, var15, var5, var6);
                              }

                              var12 = var23;
                              if (var4 != null) {
                                 break label99;
                              }
                           }

                           var24 = this.z(var1, var2, var15);
                        }

                        var12 = var24;
                     }

                     int var25 = var12;
                     if (var4 != null) {
                        if (var12 <= var7) {
                           break label79;
                        }

                        var25 = var12;
                     }

                     var7 = var25;
                  }

                  var14--;
               }

               if (var4 == null) {
                  break;
               }
            }

            var9--;
            if (var4 != null) {
               continue label113;
            }
            break;
         }

         return var7;
      }
   }

   public void O(int[] var1, int[] var2, int var3, int var4) {
      String[] var10000 = W5.q();
      int var6 = 0;
      String[] var5 = var10000;

      label40:
      while (true) {
         int var10 = var6;

         label38:
         while (var10 < var4) {
            int var7 = 0;

            while (var7 < var3) {
               int var8 = var7 + var6 * var3;
               var10 = (this.g) ? 1 : 0;
               if (var5 == null) {
                  continue label38;
               }

               label32: {
                  if (var5 != null) {
                     if (this.g) {
                        var11 = var1[var8] >> a(10602, 7392962193094856955L) & a(9083, 1618016983242824421L);
                        break label32;
                     }

                     var10 = var1[var8];
                  }

                  var11 = Iw4.g(var10);
               }

               int var9 = var11;
               var2[var8] = var9 * a(10183, 8928017420293561943L) / a(14679, 8955212196155834575L);
               var7++;
               if (var5 == null) {
                  break;
               }
            }

            var6++;
            if (var5 == null) {
               return;
            }
            continue label40;
         }

         return;
      }
   }

   public void u(int[] var1, int[] var2, int var3, int var4, int var5) {
      float var11;
      int var17;
      YY3 var32;
      String[] var6 = W5.q();
      int var10000 = var5;
      if (var6 != null) {
         if (var5 == 0) {
            var5 = 1;
         }

         var10000 = 0;
      }

      int var7 = var10000;

      label160:
      while (true) {
         var10000 = var7;

         label158:
         while (var10000 < var4) {
            int var8 = 0;

            while (var8 < var3) {
               int var9 = var8 + var7 * var3;
               int var10 = var1[var9];
               var11 = 0.0F;
               int var12 = 0;
               int var13 = 0;
               int var14 = 0;
               int var15 = 0;
               var10000 = var10;
               if (var6 == null) {
                  continue label158;
               }

               label152: {
                  label166: {
                     label167: {
                        if (var6 != null) {
                           if (var10 == 0) {
                              var15 = 0;
                              var14 = 0;
                              var13 = 0;
                              boolean var22 = false;
                              var12 = var2[var9] >> a(15681, 7575062695699858646L) & a(12960, 7040494127712750397L);
                              if (var6 != null) {
                                 break label166;
                              }
                           }

                           var11 = NM.X(this.x * (float)var10 / (float)var5, 0.0F, 1.0F);
                           var32 = this;
                           if (var6 == null) {
                              break label167;
                           }

                           var10000 = this.B;
                        }

                        switch (var10000) {
                           case 1:
                              var11 = NM.P(var11);
                              if (var6 != null) {
                                 break;
                              }
                           case 2:
                              var11 = NM.q(var11);
                              if (var6 != null) {
                                 break;
                              }
                           case 3:
                              var11 = NM.k(0.0F, 1.0F, var11);
                        }

                        var32 = this;
                     }

                     label134: {
                        Po2 var33 = var32.r;
                        if (var6 != null) {
                           if (var32.r == null) {
                              var13 = var14 = var15 = (int)(var11 * 255.0F);
                              if (var6 != null) {
                                 break label134;
                              }
                           }

                           var33 = this.r;
                        }

                        int var16 = var33.D(var11);
                        var13 = var16 >> a(20511, 7088290424385907078L) & a(9083, 1618016983242824421L);
                        var14 = var16 >> a(7890, 2694368585348638528L) & a(9083, 1618016983242824421L);
                        var15 = var16 & a(9083, 1618016983242824421L);
                     }

                     label127: {
                        var10000 = (this.g) ? 1 : 0;
                        if (var6 != null) {
                           if (this.g) {
                              var10000 = var2[var9] >> a(10602, 7392962193094856955L) & a(9083, 1618016983242824421L);
                              break label127;
                           }

                           var10000 = var2[var9];
                        }

                        var10000 = Iw4.g(var10000);
                     }

                     var12 = var10000;
                     var10000 = (this.j) ? 1 : 0;
                     if (var6 == null) {
                        break label152;
                     }

                     if (this.j) {
                        var13 = a(9083, 1618016983242824421L) - var13;
                        var14 = a(9083, 1618016983242824421L) - var14;
                        var15 = a(9083, 1618016983242824421L) - var15;
                     }
                  }

                  var10000 = (this.f) ? 1 : 0;
               }

               label118: {
                  label169: {
                     if (var6 != null) {
                        if (var10000 == 0) {
                           break label169;
                        }

                        var10000 = a(9083, 1618016983242824421L);
                     }

                     int var27 = var10000;
                     var17 = var2[var9];
                     int var18 = (var17 & a(29802, 8218070487563013625L)) >> a(10602, 7392962193094856955L);
                     int var19 = (var17 & a(15482, 6432552748192253414L)) >> a(31268, 5424630235182891966L);
                     int var20 = (var17 & a(22751, 3229919046705258820L)) >> a(27318, 6035896854312162089L);
                     int var21 = var17 & a(9083, 1618016983242824421L);
                     var19 = var13 * var19 / var27;
                     var20 = var14 * var20 / var27;
                     var21 = var15 * var21 / var27;
                     var10000 = var19;
                     if (var6 != null) {
                        if (var19 < 0) {
                           var19 = 0;
                        }

                        var10000 = var19;
                     }

                     if (var6 != null) {
                        if (var10000 > a(9083, 1618016983242824421L)) {
                           var19 = a(9083, 1618016983242824421L);
                        }

                        var10000 = var20;
                     }

                     if (var6 != null) {
                        if (var10000 < 0) {
                           var20 = 0;
                        }

                        var10000 = var20;
                     }

                     if (var6 != null) {
                        if (var10000 > a(9083, 1618016983242824421L)) {
                           var20 = a(9083, 1618016983242824421L);
                        }

                        var10000 = var21;
                     }

                     if (var6 != null) {
                        if (var10000 < 0) {
                           var21 = 0;
                        }

                        var10000 = var21;
                     }

                     label104: {
                        if (var6 != null) {
                           if (var10000 <= a(9083, 1618016983242824421L)) {
                              break label104;
                           }

                           var10000 = a(9083, 1618016983242824421L);
                        }

                        var21 = var10000;
                     }

                     var2[var9] = var18 << a(10602, 7392962193094856955L)
                        | var19 << a(31268, 5424630235182891966L)
                        | var20 << a(27318, 6035896854312162089L)
                        | var21;
                     if (var6 != null) {
                        break label118;
                     }
                  }

                  var2[var9] = var12 << a(10602, 7392962193094856955L)
                     | var13 << a(31268, 5424630235182891966L)
                     | var14 << a(27318, 6035896854312162089L)
                     | var15;
               }

               var8++;
               if (var6 == null) {
                  break;
               }
            }

            var7++;
            if (var6 == null) {
               return;
            }
            continue label160;
         }

         return;
      }
   }

   public int F(int var1, int var2, int[] var3, int var4, int var5, int var6, int var7) {
      int var11;
      int var17;
      int var18;
      int var19;
      String[] var10000 = W5.q();
      var11 = var5 - var4 - var4 - 2;
      int var12 = var11 + var4;
      String[] var8 = var10000;
      int var13 = var12 + var4;
      int var14 = var13 + var4;
      int var15 = var14 + var4;
      var17 = var2;
      if (var8 != null) {
         if (var2 != 0) {
            if (var8 == null) {
               return var1;
            }

            if (var1 != 0) {
               if (var8 == null) {
                  return var2;
               }

               label181:
               if (var2 != var7 + 2) {
                  var18 = var1;
                  int var10001 = var6 + 2;
                  if (var8 != null) {
                     if (var1 == var10001) {
                        break label181;
                     }

                     var18 = var3[var12 + 2];
                     var10001 = a(10183, 8928017420293561943L);
                  }

                  int var10 = var18 + var10001;
                  int var9 = var10;
                  int var16 = var3[var13 + 1] + a(10183, 8928017420293561943L);
                  var19 = var16;
                  var10001 = var10;
                  if (var8 != null) {
                     if (var16 < var10) {
                        var9 = var16;
                     }

                     var16 = var3[var13 + 3] + a(10183, 8928017420293561943L);
                     var19 = var16;
                     var10001 = var9;
                  }

                  if (var8 != null) {
                     if (var19 < var10001) {
                        var9 = var16;
                     }

                     var16 = var3[var14 + 2] + a(10183, 8928017420293561943L);
                     var19 = var16;
                     var10001 = var9;
                  }

                  if (var8 != null) {
                     if (var19 < var10001) {
                        var9 = var16;
                     }

                     var16 = var3[var12 + 1] + N;
                     var19 = var16;
                     var10001 = var9;
                  }

                  if (var8 != null) {
                     if (var19 < var10001) {
                        var9 = var16;
                     }

                     var16 = var3[var12 + 3] + N;
                     var19 = var16;
                     var10001 = var9;
                  }

                  if (var8 != null) {
                     if (var19 < var10001) {
                        var9 = var16;
                     }

                     var16 = var3[var14 + 1] + N;
                     var19 = var16;
                     var10001 = var9;
                  }

                  if (var8 != null) {
                     if (var19 < var10001) {
                        var9 = var16;
                     }

                     var16 = var3[var14 + 3] + N;
                     var19 = var16;
                     var10001 = var9;
                  }

                  if (var8 != null) {
                     if (var19 < var10001) {
                        var9 = var16;
                     }

                     var19 = var2;
                     if (var8 == null) {
                        return var2;
                     }

                     var10001 = 1;
                  }

                  if (var19 != var10001) {
                     if (var8 == null) {
                        return var1;
                     }

                     if (var1 != 1) {
                        if (var8 == null) {
                           return var2;
                        }

                        if (var2 != var7 + 1) {
                           int var20 = var1;
                           var10001 = var6 + 1;
                           if (var8 != null) {
                              if (var1 == var10001) {
                                 return var3[var5] = var9;
                              }

                              var16 = var3[var11 + 1] + t;
                              var20 = var16;
                              var10001 = var9;
                           }

                           if (var8 != null) {
                              if (var20 < var10001) {
                                 var9 = var16;
                              }

                              var16 = var3[var11 + 3] + t;
                              var20 = var16;
                              var10001 = var9;
                           }

                           if (var8 != null) {
                              if (var20 < var10001) {
                                 var9 = var16;
                              }

                              var16 = var3[var12 + 4] + t;
                              var20 = var16;
                              var10001 = var9;
                           }

                           if (var8 != null) {
                              if (var20 < var10001) {
                                 var9 = var16;
                              }

                              var16 = var3[var14 + 4] + t;
                              var20 = var16;
                              var10001 = var9;
                           }

                           if (var8 != null) {
                              if (var20 < var10001) {
                                 var9 = var16;
                              }

                              var16 = var3[var15 + 3] + t;
                              var20 = var16;
                              var10001 = var9;
                           }

                           if (var8 != null) {
                              if (var20 < var10001) {
                                 var9 = var16;
                              }

                              var16 = var3[var15 + 1] + t;
                              var20 = var16;
                              var10001 = var9;
                           }

                           if (var8 != null) {
                              if (var20 < var10001) {
                                 var9 = var16;
                              }

                              var16 = var3[var14] + t;
                              var20 = var16;
                              var10001 = var9;
                           }

                           if (var8 != null) {
                              if (var20 < var10001) {
                                 var9 = var16;
                              }

                              var16 = var3[var12] + t;
                              var20 = var16;
                              if (var8 == null) {
                                 return var16;
                              }

                              var10001 = var9;
                           }

                           if (var20 < var10001) {
                              var9 = var16;
                           }

                           return var3[var5] = var9;
                        }
                     }
                  }

                  return var3[var5] = var9;
               }
            }
         }

         var17 = var3[var5] = a(7548, 1661832290068751594L);
      }

      return var17;
   }

   public int z(int[] var1, int var2, int var3) {
      int var11;
      int var7 = var3 - var2 - var2 - 2;
      String[] var10000 = W5.q();
      int var8 = var7 + var2;
      String[] var4 = var10000;
      int var9 = var8 + var2;
      int var10 = var9 + var2;
      var11 = var10 + var2;
      int var6 = var1[var8 + 2] + a(10183, 8928017420293561943L);
      int var5 = var6;
      int var12 = var1[var9 + 1] + a(10183, 8928017420293561943L);
      int var13 = var12;
      int var10001 = var6;
      if (var4 != null) {
         if (var12 < var6) {
            var5 = var12;
         }

         var12 = var1[var9 + 3] + a(10183, 8928017420293561943L);
         var13 = var12;
         var10001 = var5;
      }

      if (var4 != null) {
         if (var13 < var10001) {
            var5 = var12;
         }

         var12 = var1[var10 + 2] + a(10183, 8928017420293561943L);
         var13 = var12;
         var10001 = var5;
      }

      if (var4 != null) {
         if (var13 < var10001) {
            var5 = var12;
         }

         var12 = var1[var8 + 1] + N;
         var13 = var12;
         var10001 = var5;
      }

      if (var4 != null) {
         if (var13 < var10001) {
            var5 = var12;
         }

         var12 = var1[var8 + 3] + N;
         var13 = var12;
         var10001 = var5;
      }

      if (var4 != null) {
         if (var13 < var10001) {
            var5 = var12;
         }

         var12 = var1[var10 + 1] + N;
         var13 = var12;
         var10001 = var5;
      }

      if (var4 != null) {
         if (var13 < var10001) {
            var5 = var12;
         }

         var12 = var1[var10 + 3] + N;
         var13 = var12;
         var10001 = var5;
      }

      if (var4 != null) {
         if (var13 < var10001) {
            var5 = var12;
         }

         var12 = var1[var7 + 1] + t;
         var13 = var12;
         var10001 = var5;
      }

      if (var4 != null) {
         if (var13 < var10001) {
            var5 = var12;
         }

         var12 = var1[var7 + 3] + t;
         var13 = var12;
         var10001 = var5;
      }

      if (var4 != null) {
         if (var13 < var10001) {
            var5 = var12;
         }

         var12 = var1[var8 + 4] + t;
         var13 = var12;
         var10001 = var5;
      }

      if (var4 != null) {
         if (var13 < var10001) {
            var5 = var12;
         }

         var12 = var1[var10 + 4] + t;
         var13 = var12;
         var10001 = var5;
      }

      if (var4 != null) {
         if (var13 < var10001) {
            var5 = var12;
         }

         var12 = var1[var11 + 3] + t;
         var13 = var12;
         var10001 = var5;
      }

      if (var4 != null) {
         if (var13 < var10001) {
            var5 = var12;
         }

         var12 = var1[var11 + 1] + t;
         var13 = var12;
         var10001 = var5;
      }

      if (var4 != null) {
         if (var13 < var10001) {
            var5 = var12;
         }

         var12 = var1[var10] + t;
         var13 = var12;
         var10001 = var5;
      }

      if (var4 != null) {
         if (var13 < var10001) {
            var5 = var12;
         }

         var12 = var1[var8] + t;
         var13 = var12;
         if (var4 == null) {
            return var12;
         }

         var10001 = var5;
      }

      if (var13 < var10001) {
         var5 = var12;
      }

      return var1[var3] = var5;
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31130;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      int var11;
      long[] var18;
      int var19;
      byte var24;
      long var32;
      char[] var10003 = "-z`k2\tqQ]qf+\u0016v\u000b|jsu]:".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 56;
      char[] var10002 = var10003;
      var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 56;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 70;
               break;
            case 1:
               var50 = 54;
               break;
            case 2:
               var50 = 33;
               break;
            case 3:
               var50 = 63;
               break;
            case 4:
               var50 = 99;
               break;
            case 5:
               var50 = 75;
               break;
            default:
               var50 = 44;
         }
      } else {
         var34 = 56;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 8140490673339246654L;
            long[] var14 = new long[14];
            var11 = 0;
            String var12 = "Ä\u0007er\u001c/«\u0090§x\u0086\u008a¹ævza°\u0018p\u0091ÙhûÖï±\u0015Ë\u0097\u0001¨\u008f%Òs\u0087xò$Ø9ú\u008d¿è»\u001f¡[\u001bC\u0093ÍmØÔ\u0013û\u009fDNãü(¥\u001d\u0097ÖiOv\u0098\u001fÿ\u0096è\u0094¥Ç\\+Z¤¤Üö@M\u0007\u001d\u0097Ì\u008bøÝ";
            int var13 = "Ä\u0007er\u001c/«\u0090§x\u0086\u008a¹ævza°\u0018p\u0091ÙhûÖï±\u0015Ë\u0097\u0001¨\u008f%Òs\u0087xò$Ø9ú\u008d¿è»\u001f¡[\u001bC\u0093ÍmØÔ\u0013û\u009fDNãü(¥\u001d\u0097ÖiOv\u0098\u001fÿ\u0096è\u0094¥Ç\\+Z¤¤Üö@M\u0007\u001d\u0097Ì\u008bøÝ"
               .length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
               var18 = var14;
               var25 = var11++;
               var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[14];
                           N = (int)(41.0 * Math.sqrt(2.0));
                           t = (int)(41.0 * Math.sqrt(5.0));
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u0019½\r8\u009c\u0016Lýl«oæ\tDìð";
                        var13 = "\u0019½\r8\u009c\u0016Lýl«oæ\tDìð".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 56;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 70;
               break;
            case 1:
               var50 = 54;
               break;
            case 2:
               var50 = 33;
               break;
            case 3:
               var50 = 63;
               break;
            case 4:
               var50 = 99;
               break;
            case 5:
               var50 = 75;
               break;
            default:
               var50 = 44;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 70;
                  break;
               case 1:
                  var50 = 54;
                  break;
               case 2:
                  var50 = 33;
                  break;
               case 3:
                  var50 = 63;
                  break;
               case 4:
                  var50 = 99;
                  break;
               case 5:
                  var50 = 75;
                  break;
               default:
                  var50 = 44;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 8140490673339246654L;
               long[] var6 = new long[14];
               int var3 = 0;
               String var4 = "Ä\u0007er\u001c/«\u0090§x\u0086\u008a¹ævza°\u0018p\u0091ÙhûÖï±\u0015Ë\u0097\u0001¨\u008f%Òs\u0087xò$Ø9ú\u008d¿è»\u001f¡[\u001bC\u0093ÍmØÔ\u0013û\u009fDNãü(¥\u001d\u0097ÖiOv\u0098\u001fÿ\u0096è\u0094¥Ç\\+Z¤¤Üö@M\u0007\u001d\u0097Ì\u008bøÝ";
               int var5 = "Ä\u0007er\u001c/«\u0090§x\u0086\u008a¹ævza°\u0018p\u0091ÙhûÖï±\u0015Ë\u0097\u0001¨\u008f%Òs\u0087xò$Ø9ú\u008d¿è»\u001f¡[\u001bC\u0093ÍmØÔ\u0013û\u009fDNãü(¥\u001d\u0097ÖiOv\u0098\u001fÿ\u0096è\u0094¥Ç\\+Z¤¤Üö@M\u0007\u001d\u0097Ì\u008bøÝ"
                  .length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[14];
                              N = (int)(41.0 * Math.sqrt(2.0));
                              t = (int)(41.0 * Math.sqrt(5.0));
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u0019½\r8\u009c\u0016Lýl«oæ\tDìð";
                           var5 = "\u0019½\r8\u009c\u0016Lýl«oæ\tDìð".length();
                           var2 = 0;
                     }

                     var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 70;
                  break;
               case 1:
                  var50 = 54;
                  break;
               case 2:
                  var50 = 33;
                  break;
               case 3:
                  var50 = 63;
                  break;
               case 4:
                  var50 = 99;
                  break;
               case 5:
                  var50 = 75;
                  break;
               default:
                  var50 = 44;
            }
         }
      }
   }
}





