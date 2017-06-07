import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { WorkingAreaComponent } from './working-area/working-area.component';
import { FooterComponent } from './footer/footer.component';
import { UsersComponent } from './users/users.component';
import { UsersService } from './services/users.service';
  
@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    WorkingAreaComponent,
    FooterComponent,
    UsersComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [UsersService],
  bootstrap: [AppComponent]
})
export class AppModule { }
