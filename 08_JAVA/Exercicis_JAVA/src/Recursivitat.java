public class Recursivitat {
    public static void main(String[] args) {
        Recursivitat r = new Recursivitat();
        String [] tecnologies = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};

        //r.recorreArray(tecnologies, 0);
        r.recorreArrayFins(tecnologies, 0, 2);
    }

    public void recorreArray(String[] llista, int index){
        if (index == llista.length){
            return;
        }
        System.out.println(llista[index]);

        recorreArray(llista, index + 1);
    }

    public  void recorreArrayFins(String[] llista, int index, int indexFinal){
        if (index >= llista.length || index > indexFinal){
            return;
        }
        System.out.println(llista[index]);

        recorreArrayFins(llista, index + 1, indexFinal);
    }
}
