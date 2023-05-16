package SembolTableStructure.VaraibleType;

import java.util.ArrayList;
import java.util.List;

public abstract class _Variable {

     public int lineOfDeclaration;
     public List< Integer > lineOfUsage = new ArrayList<>();



     public int getLineOfDeclaration() {
          return lineOfDeclaration;
     }

     public void setLineOfDeclaration(int lineOfDeclaration) {
          this.lineOfDeclaration = lineOfDeclaration;
     }

     public List<Integer> getLineOfUsage() {
          return lineOfUsage;
     }

     public void setLineOfUsage(List<Integer> lineOfUsage) {
          this.lineOfUsage = lineOfUsage;
     }
}
