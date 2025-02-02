public class Demo{
  
  public static void removeDuplicates(SuperArray s){
    for (int i = 0; i < s.size(); i ++){
      if (i != s.indexOf(s.get(i))) {
        s.remove(i);
        i --;}
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray overlap = new SuperArray();
    for (int i = 0; i < a.size(); i ++){
      if (b.contains(a.get(i))) overlap.add(a.get(i));
    }
    removeDuplicates(overlap);
    return overlap;
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray c = new SuperArray();
    for (int i = 0; i < Math.max(a.size(), b.size()); i ++){
      if (i < a.size()) c.add(a.get(i));
      if (i < b.size()) c.add(b.get(i));
    }
    return c;
  }
}
