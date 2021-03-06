import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';
import { Http, Response } from '@angular/http';
import { User } from '../domain/user';
import { environment } from 'app/../environments/environment';

@Injectable()
export class UsersService {

  private userUrl = environment.serviceUsersUrl

  constructor(
    private http: Http
  ) { }

  getUsers(): Observable<User[]> {
    console.log("URL: " + this.userUrl);
    return this.http.get(this.userUrl)
      .map(this.extractData)
      .catch(this.handleError);
  }

  private extractData(res: Response) {
    let body = res.json();
    return body || {};
  }

  private handleError(error: Response | any) {
    // In a real world app, you might use a remote logging infrastructure
    let errMsg: string;
    if (error instanceof Response) {
      const body = error.json() || '';
      const err = body.error || JSON.stringify(body);
      errMsg = `${error.status} - ${error.statusText || ''} ${err}`;
    } else {
      errMsg = error.message ? error.message : error.toString();
    }
    console.error(errMsg);
    return Observable.throw(errMsg);
  }
}