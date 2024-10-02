class Solution {
    public String[] findWords(String[] words) {
        char[] topRow = {'q','w','e','r','t','y','u','i','o','p'};
        char[] midRow = {'a','s','d','f','g','h','j','k','l'};
        char[] botmRow = {'z','x','c','v','b','n','m'};

        ArrayList<Character> tr = new ArrayList<Character>();
        ArrayList<Character> mr = new ArrayList<Character>();
        ArrayList<Character> br = new ArrayList<Character>();
        ArrayList<String> ansList = new ArrayList<String>();

        for(char x : topRow)
        {
            tr.add(x);
        }
        for(char y : midRow)
        {
            mr.add(y);
        }
        for(char z : botmRow)
        {
            br.add(z);
        }

        outer:for(int i = 0; i < words.length; i++)
        {
            String lower = words[i].toLowerCase();
            switch(lower.charAt(0))
            {
                case 'q':
                case 'w':
                case 'e':
                case 'r':
                case 't':
                case 'y':
                case 'u':
                case 'i':
                case 'o':
                case 'p': for(int j = 1; j < lower.length(); j++)
                        {
                            if(tr.contains(lower.charAt(j)) == false)
                                continue outer;
                        }
                        ansList.add(words[i]);
                        break;
                case 'a':
                case 's':
                case 'd':
                case 'f':
                case 'g':
                case 'h':
                case 'j':
                case 'k':
                case 'l': for(int k = 1; k < lower.length(); k++)
                        {
                            if(mr.contains(lower.charAt(k)) == false)
                                continue outer;
                        }
                        ansList.add(words[i]);
                        break;
                case 'z':
                case 'x':
                case 'c':
                case 'v':
                case 'b':
                case 'n':
                case 'm': for(int l = 1; l < lower.length(); l++)
                        {
                            if(br.contains(lower.charAt(l)) == false)
                                continue outer;
                        }
                        ansList.add(words[i]);
                        break;
                default : break;
            }
        }

        String[] res = new String[ansList.size()];

        for(int i = 0; i < res.length; i++)
        {
            res[i] = ansList.get(i);
        }

        return res;
    }
}