import { Injectable } from '@angular/core';
import{HttpClient} from '@angular/common/http'
@Injectable({
  providedIn: 'root'
})
export class HttpService {
  url:string="http://localhost:8080/"

  constructor(private http:HttpClient) { }

  getValue(){
    return(this.http.get(`${this.url}printtrade`))
  }
  setValue(data:any){
    return(this.http.post( `${this.url}booktrade`,data,{responseType:"text"}));
  }
}