import React, { Fragment } from "react";
import ListPatientsContainer from "./components/ListPatientsContainer";

export default class PatientComponent extends React.Component {
  render() {
    return (
      <Fragment>
        <div>patient</div>
        <ListPatientsContainer/>
      </Fragment>
      )
  }
}

