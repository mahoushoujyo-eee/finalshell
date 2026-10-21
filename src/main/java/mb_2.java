import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

class mb_2 implements Runnable {
   final DefaultMutableTreeNode z;
   final aJ k;

   mb_2(aJ var1, DefaultMutableTreeNode var2) {
      this.k = var1;
      this.z = var2;
   }

   @Override
   public void run() {
      ((aJ)com.c.c(378334503934228454L).get(this))
         .scrollPathToVisible(new TreePath(((DefaultMutableTreeNode)com.c.c(248562327588639967L).get(this)).getPath()));
   }
}





