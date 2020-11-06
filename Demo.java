public class Demo{

  public static void removeDuplicates(SuperArray s){
    for (int i = 0; i < s.size(); i ++){
      if (i != s.indexOf(s.get(i))) {
        s.remove(i);
        i --;
      }
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

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    //total 5
    System.out.println(words);
    System.out.println(words.indexOf("ebi")); // 2
    System.out.println(words.lastIndexOf("ebi")); // 9
    removeDuplicates(words);
    System.out.println(words); //kani, uni, ebi, una, toro
    SuperArray a = new SuperArray();
    SuperArray b = new SuperArray();
    a.add("9"); a.add("1"); a.add("2"); a.add("2"); a.add("3"); a.add("4");
    b.add("0"); b.add("4"); b.add("2"); b.add("2"); b.add("9");
    System.out.println(findOverlap(a, b)); // 9, 2, 4
    System.out.println(a.equals(b)); // false
    b.add("6");
    System.out.println(a.equals(b)); // false
    SuperArray c = new SuperArray();
    c.add("9"); c.add("1"); c.add("2"); c.add("2"); c.add("3");
    System.out.println(a.equals(c)); // false
    c.add("4");
    System.out.println(a.equals(c)); // true
  }
}
