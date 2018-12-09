package br.edu.fatec.noticiasAppJader.Interface;

import br.edu.fatec.noticiasAppJader.Model.IconBetterIdea;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;



public interface IconBetterIdeaService {
    @GET
    Call<IconBetterIdea> getIconUrl(@Url String url);
}
