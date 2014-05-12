package controllers

import play.api._

import play.api.mvc._


object MainController extends Controller 
{
    def index = Action {
        Ok(views.html.index(" a message "))
    }
    
    def index2 = Action
    {
        Ok(views.html.index("a message"));
    }
    
    def game = Action
    {
    	Ok(views.html.game());
    }
}
