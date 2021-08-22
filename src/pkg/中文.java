package pkg;

import java.util.Random;
import java.util.TreeMap;

public class 中文 {
    TreeMap<String, String[]> dict = new TreeMap<>(); //arr at 0 is pinyin. arr at 1 is the English translation. arr at 2 is the Spanish translation. arr at 3 is the example sentence.
    Random r = new Random();

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public void getFullWord(String chineseChar){
        String key = chineseChar;
        String[] arr = dict.get(key);
        String pinyin = arr[0];
        String eng = arr[1];
        String esp = arr[2];
        String ex = arr[3];
        System.out.println("Chinese character: " + key);
        System.out.println("Pinyin: " + pinyin);
        System.out.println("English translation: " + eng);
        System.out.println("Spanish translation: " + esp);
        System.out.println("Example sentence: " + ex);
    }

    public void addWord(String hanzi, String p, String eng, String esp, String ex){
        String[] arr = new String[3];
        arr[0] = p;
        arr[1] = eng;
        arr[2] = esp;
        arr[3] = ex;
        dict.put(hanzi, arr);
        System.out.println("New word added!");
    }

    public void fillHSK2(){
        addWord("爱","ài","to love", "amar", "妈妈，我爱你。 我爱吃米饭。");
        addWord("八","bā","eight", "ocho", "他儿子今年八岁了。");
        addWord("爸爸", "bàba", "dad, father","papá, padre", "我爸爸是医生。" );
        addWord("杯子", "bēizi", "cup", "vaso", "杯子里有茶。");
        addWord("北京", "Běijīng", "Beijing", "Beijing", "我住在北京。");
        addWord("本","běn", "classifier for books, magazines, etc.","clasificador para libros, revistas, etc.", "桌子上有一本书。");
        addWord("不客气", "bú kè qi", "you're welcome", "de nada", "我：谢谢你！服务员：不客气。");
        addWord("不", "bù", "no", "no", "我不是学生。");
        addWord("菜","cài", "vegetables", "vegetales", "我去超市买点儿菜");
        addWord("茶","chá", "tea", "té", "庆贺杯茶吧。");
        addWord("吃", "chī", "to eat", "comer", "清吃点儿米饭。");
        addWord("出租车", "chūzūchē", "taxi", "taxi", "我们坐出租车去火车站。");

    }

}
