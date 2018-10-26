package com.ismail;


public class LolRequests {
    // curl --request GET 'https://na1.api.riotgames.com/lol/summoner/v3/summoners/by-name/RiotSchmick?api_key=RGAPI-86d89a5d-3b70-457b-adc6-610afab42ba7' --include
    // https://na1.api.riotgames.com/lol/summoner/v3/summoners/by-name/DeathDragon97?api_key=RGAPI-226e4526-8a33-49f1-8490-2f99ab87a068
    // Summoner by Account ID: /lol/summoner/v3/summoners/by-account/{accountId}
    // https://na1.api.riotgames.com/lol/summoner/v3/summoners/by-account/203344624?api_key=RGAPI-226e4526-8a33-49f1-8490-2f99ab87a068
    /*
    JSON returned
    {
        "id": 40396988,
        "accountId": 203344624,
        "name": "DeathDragon97",
        "profileIconId": 3159,
        "revisionDate": 1539920319000,
        "summonerLevel": 105
    }
     */
    // URL+Request+?api_key=+API_KEY
    final String API_Key = "RGAPI-86d89a5d-3b70-457b-adc6-610afab42ba7";

    final String BASE_URL = "https://na1.api.riotgames.com";


    String requestSummonerByName(String sName){
        String requestUrl = "/lol/summoner/v3/summoners/by-name/";
        return requestUrl + sName;
    }



}