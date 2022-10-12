import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { exit } from 'process';
import { BookComponent } from './book/book.component';
import { ExitComponent } from './exit/exit.component';
import { HomeComponent } from './home/home.component';
import { PrintComponent } from './print/print.component';

const routes: Routes = [
  
    {
      path:"book",component:BookComponent
    },
    {
      path:"**",component:HomeComponent
    },
    {
      path:"print",component:PrintComponent
    },
    {
      path:"exit",component:ExitComponent
    }
    

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
