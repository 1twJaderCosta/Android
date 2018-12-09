package br.edu.fatec.noticiasAppJader.Interface;

import br.edu.fatec.noticiasAppJader.Common.Common;
import br.edu.fatec.noticiasAppJader.Model.News;
import br.edu.fatec.noticiasAppJader.Model.WebSite;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;


public interface NewsService {
    @GET("v2/sources?language=br&apiKey="+ Common.API_KEY)
    Call<WebSite> getSources();

    @GET
    Call<News> getNewestArticles(@Url String url);
}
