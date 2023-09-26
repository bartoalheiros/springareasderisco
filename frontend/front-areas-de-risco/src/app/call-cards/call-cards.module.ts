import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CallCardsRoutingModule } from './call-cards-routing.module';
import { CallCardsComponent } from './call-cards/call-cards.component';


@NgModule({
  declarations: [
    CallCardsComponent
  ],
  imports: [
    CommonModule,
    CallCardsRoutingModule
  ]
})
export class CallCardsModule { }
