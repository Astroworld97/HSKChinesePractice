package pkg;

import java.util.*;

public class 中文 {
    TreeMap<String, String[]> dict; //arr at 0 is pinyin. arr at 1 is the English translation. arr at 2 is the Spanish translation. arr at 3 is the example sentence.
    Random r;

    public 中文(){
        dict = new TreeMap<>();
        r = new Random();
    }

    public void getRandomFullWord(){
        Set<Map.Entry<String, String[]>> entries = dict.entrySet();
        ArrayList<Map.Entry<String, String[]>> randAccess = new ArrayList<Map.Entry<String, String[]>>(dict.entrySet());
        int i = r.nextInt(randAccess.size());
        Map.Entry<String, String[]> x = randAccess.get(i);
        getFullWord(x.getKey());
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
        addWord("打电话", "dǎ diànhuà", "speak on the phone", "hablar por teléfono", "他在打电话呢。");
        addWord("大","dà", "big", "grande", "这个苹果很大。");
        addWord("的","de", "1. of; 2. expressing emphasis; 3. indicating something or someone.", "1. de; 2. expresando énfasis; 3. indicando algo o alguien.", "1： 这是我的书。2：我是坐飞机来中国的。3：家里没吃的了，我们去买点儿吧。");
        addWord("点","diǎn","the hour", "la hora", "现在是下午3点20。");
        addWord("电脑","diànnǎo", "computer", "computadora", "我买了个电脑。");
        addWord("电视", "diànshì","television", "televisión", "妈妈在看电视。");
        addWord("电影","diànyǐng","movie", "película","我喜欢看电影。");
        addWord("东西","dōngxi", "thing, object", "cosa, objeto","我在商店买了很多东西。");
        addWord("都","dōu","1. all, everything; 2. emphasizing","1. todos; 2. enfatizar","1：我们都来了。2：我都快吃完了。");
        addWord("读","dú","to read","leer","1：你会读这个汉子吗？2：你喜欢读书吗？");
        addWord("对不起","duìbuqǐ", "sorry", "perdón", "我：对不起。你：没关系。");
        addWord("多","duō", "1. a lot; 2. how much, how many; 3. what (exclamation)", "1. mucho; 2. cuánto, cómo (para preguntar cantidad o nivel); 3. qué (antes del adjectivo para la exclamación)", "1： 这里的人很多。2：你儿子多大了？3：你跟得多快啊！");
        addWord("多少","duōshao", "how much", "cuánto", "你们学校有多少学生？");
        addWord("儿子", "érzi", "son", "hijo", "我儿子三岁了。");
        addWord("二", "èr", "two", "dos", "现在十二点了。");

    }

}
