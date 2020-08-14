import React, { Fragment } from "react";
import ListConsultationsContainer from "./components/ListConsultationContainer";

export default class ConsultationComponent extends React.Component {
  render() {
    return (
      <Fragment>
        <div>consultations</div>
        <ListConsultationsContainer/>
      </Fragment>
      )
  }
}

