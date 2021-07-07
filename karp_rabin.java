public class karp_rabin {
    public final static int d=256;
    public static void main(String[] args) {
        String txt = "Hello World";
        String word = "Hello";
        int prime=101;
        search(word,txt,prime);
        
        
    }
    public static void search(String word,String txt,int prime)
        {
        int wlen = word.length();
        int txtlen = txt.length();
        int i,j;
        int h = 1;
        
        for(i=0;i<wlen-1;i++)
        {
            h=(h*d)%prime;
        }
        int p=0, t=0 ;
        //hash val of word and first text window
        for(i=0;i<wlen;i++)
        {
            p = (d*p + word.charAt(i))%prime;
            t = (d*t + txt.charAt(i))%prime;

        }
        for(i=0;i<=txtlen-wlen;i++)
        {
            if(p==t)
            {
                for(j=0;j<wlen;j++)
                {
                    if(txt.charAt(i+j)!=word.charAt(j))
                    {
                        break;
                    }
                    
                }
                if(j==wlen)
                    {
                        System.out.println("word found at index" + i);
                    }
            }
           
            if(i<txtlen-wlen)
            {
                t=(d*(t-txt.charAt(i)*h)+txt.charAt(i+wlen))%prime;
                if(t<0)
                {
                    t+=prime;
                }
            }

        }
        
    
    }
}
