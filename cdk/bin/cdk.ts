#!/usr/bin/env node
import 'source-map-support/register';
import { App } from 'aws-cdk-lib';
import { ServiceStack } from '../lib/service-stack';

const app = new App();
new ServiceStack(app, 'Service', {});