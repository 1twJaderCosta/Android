package br.edu.fatec.noticiasAppJader.Common;

import br.edu.fatec.noticiasAppJader.Interface.IconBetterIdeaService;
import br.edu.fatec.noticiasAppJader.Interface.NewsService;
import br.edu.fatec.noticiasAppJader.Remote.IconBetterIdeaClient;
import br.edu.fatec.noticiasAppJader.Remote.RetrofitClient;

public class Common {
    private static final String BASE_URL="https://newsapi.org/";

    public  static final String API_KEY="ed75e1209cf94e5da7f14e7c5bb36566"; // ed75e1209cf94e5da7f14e7c5bb36566

    public static NewsService getNewsService()
    {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService()
    {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }

    //https://newsapi.org/v1/articles?source=the-next-web&sortBy=latest&apiKey=ed75e1209cf94e5da7f14e7c5bb36566
    public static String getAPIUrl(String source,String sortBy,String apiKEY)
    {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/top-headlines?sources=");
        return apiUrl.append(source)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }


}

